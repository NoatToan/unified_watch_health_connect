package org.apache.commons.text.diff;

/* JADX INFO: loaded from: classes3.dex */
public interface CommandVisitor<T> {
    void visitDeleteCommand(T t7);

    void visitInsertCommand(T t7);

    void visitKeepCommand(T t7);
}
