package ta1;

import com.garmin.android.library.backgroundtaskmanagement.b;
import e23.l;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lta1/a;", "", "T", "Lcom/garmin/android/library/backgroundtaskmanagement/b$b;", "Lkotlin/Function1;", "", "onSuccess", "Lkotlin/Function0;", "onError", "<init>", "(Le23/l;Le23/a;)V", "gcm-power-guide_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a<T> implements b.InterfaceC0995b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l<T, Unit> f163502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e23.a<Unit> f163503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public T f163504c;

    /* JADX WARN: Multi-variable type inference failed */
    public a(l<? super T, Unit> lVar, e23.a<Unit> aVar) {
        lVar.getClass();
        aVar.getClass();
        this.f163502a = lVar;
        this.f163503b = aVar;
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onComplete(long j8, b.c cVar) {
        cVar.getClass();
        b.c cVar2 = b.c.SUCCESS;
        e23.a<Unit> aVar = this.f163503b;
        if (cVar != cVar2) {
            aVar.invoke();
            return;
        }
        T t7 = this.f163504c;
        if (t7 != null) {
            this.f163502a.invoke(t7);
        } else {
            aVar.invoke();
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b
    public final void onResults(long j8, b.e eVar, T t7) {
        eVar.getClass();
        t7.getClass();
        this.f163504c = t7;
    }
}
