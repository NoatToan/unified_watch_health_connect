package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n62<T> implements mp5<T> {
    @Override // defpackage.mp5
    public void onCancellation(cp5<T> cp5Var) {
    }

    @Override // defpackage.mp5
    public void onFailure(cp5<T> cp5Var) {
        try {
            onFailureImpl(cp5Var);
        } finally {
            cp5Var.close();
        }
    }

    public abstract void onFailureImpl(cp5<T> cp5Var);

    @Override // defpackage.mp5
    public void onNewResult(cp5<T> cp5Var) {
        boolean zA = cp5Var.a();
        try {
            onNewResultImpl(cp5Var);
        } finally {
            if (zA) {
                cp5Var.close();
            }
        }
    }

    public abstract void onNewResultImpl(cp5<T> cp5Var);

    @Override // defpackage.mp5
    public void onProgressUpdate(cp5<T> cp5Var) {
    }
}
