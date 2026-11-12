package org.apache.commons.text.diff;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ReplacementsFinder<T> implements CommandVisitor<T> {
    private final ReplacementsHandler<T> handler;
    private final List<T> pendingInsertions = new ArrayList();
    private final List<T> pendingDeletions = new ArrayList();
    private int skipped = 0;

    public ReplacementsFinder(ReplacementsHandler<T> replacementsHandler) {
        this.handler = replacementsHandler;
    }

    @Override // org.apache.commons.text.diff.CommandVisitor
    public void visitDeleteCommand(T t7) {
        this.pendingDeletions.add(t7);
    }

    @Override // org.apache.commons.text.diff.CommandVisitor
    public void visitInsertCommand(T t7) {
        this.pendingInsertions.add(t7);
    }

    @Override // org.apache.commons.text.diff.CommandVisitor
    public void visitKeepCommand(T t7) {
        if (this.pendingDeletions.isEmpty() && this.pendingInsertions.isEmpty()) {
            this.skipped++;
            return;
        }
        this.handler.handleReplacement(this.skipped, this.pendingDeletions, this.pendingInsertions);
        this.pendingDeletions.clear();
        this.pendingInsertions.clear();
        this.skipped = 1;
    }
}
