package ch.qos.logback.classic.db.names;

/* JADX INFO: loaded from: classes7.dex */
public interface DBNameResolver {
    <N extends Enum<?>> String getColumnName(N n14);

    <N extends Enum<?>> String getTableName(N n14);
}
