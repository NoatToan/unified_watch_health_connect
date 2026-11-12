package androidx.work.multiprocess;

/* JADX INFO: loaded from: classes4.dex */
public interface RemoteDispatcher<T> {
    void execute(T t, IWorkManagerImplCallback iWorkManagerImplCallback) throws Throwable;
}
