package org.apache.commons.text.diff;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EditCommand<T> {
    private final T object;

    public EditCommand(T t7) {
        this.object = t7;
    }

    public abstract void accept(CommandVisitor<T> commandVisitor);

    public T getObject() {
        return this.object;
    }
}
