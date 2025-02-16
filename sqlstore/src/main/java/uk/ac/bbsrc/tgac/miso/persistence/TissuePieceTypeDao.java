package uk.ac.bbsrc.tgac.miso.persistence;

import java.io.IOException;
import java.util.Collection;
import java.util.List;

import uk.ac.bbsrc.tgac.miso.core.data.type.TissuePieceType;

public interface TissuePieceTypeDao extends SaveDao<TissuePieceType> {

  long getUsage(TissuePieceType type) throws IOException;

  TissuePieceType getByName(String name) throws IOException;

  List<TissuePieceType> listByIdList(Collection<Long> ids) throws IOException;

}
