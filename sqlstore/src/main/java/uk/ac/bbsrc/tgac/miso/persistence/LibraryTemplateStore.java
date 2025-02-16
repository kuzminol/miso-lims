package uk.ac.bbsrc.tgac.miso.persistence;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import uk.ac.bbsrc.tgac.miso.core.data.impl.LibraryTemplate;
import uk.ac.bbsrc.tgac.miso.core.util.PaginatedDataSource;

public interface LibraryTemplateStore extends SaveDao<LibraryTemplate>, PaginatedDataSource<LibraryTemplate> {

  LibraryTemplate getByAlias(String alias) throws IOException;

  List<LibraryTemplate> listByProject(long projectId) throws IOException;

  List<LibraryTemplate> listByIdList(List<Long> idList) throws IOException;

}
