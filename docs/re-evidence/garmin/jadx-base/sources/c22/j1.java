package c22;

import com.google.android.gms.tasks.OnFailureListener;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
public final class j1 implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<Boolean, String, Unit> f23106a;

    /* JADX WARN: Multi-variable type inference failed */
    public j1(e23.p<? super Boolean, ? super String, Unit> pVar) {
        this.f23106a = pVar;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        exc.getClass();
        this.f23106a.invoke(Boolean.FALSE, "Failed to get initial session state: " + exc.getMessage());
    }
}
