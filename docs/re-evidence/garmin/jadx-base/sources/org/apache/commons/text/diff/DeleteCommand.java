package org.apache.commons.text.diff;

/* JADX INFO: loaded from: classes3.dex */
public class DeleteCommand<T> extends EditCommand<T> {
    public DeleteCommand(T t7) {
        super(t7);
    }

    @Override // org.apache.commons.text.diff.EditCommand
    public void accept(CommandVisitor<T> commandVisitor) {
        commandVisitor.visitDeleteCommand(getObject());
    }
}
