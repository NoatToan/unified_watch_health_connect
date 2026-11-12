package a03;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import java.util.UUID;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p3.c2;
import p3.p2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B-\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"La03/l;", "Li5/a;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "", "Lkotlin/Function0;", "", "onDismissRequest", "Landroid/view/View;", "composeView", "La03/p;", "sheetState", "Ljava/util/UUID;", "saveId", "<init>", "(Le23/a;Landroid/view/View;La03/p;Ljava/util/UUID;)V", "flexible-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
public final class l extends kotlin.a implements ViewTreeObserver.OnGlobalLayoutListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f115g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e23.a<Unit> f116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f118c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowManager f119d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c2 f120e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f121f;

    /* JADX WARN: Illegal instructions before constructor call */
    public l(e23.a<Unit> aVar, View view2, p pVar, UUID uuid) {
        aVar.getClass();
        view2.getClass();
        pVar.getClass();
        uuid.getClass();
        Context context = view2.getContext();
        context.getClass();
        super(context, null, 0, 6, null);
        this.f116a = aVar;
        this.f117b = view2;
        this.f118c = pVar;
        setId(R.id.content);
        setTag(com.garmin.android.apps.connectmobile.R.id.view_tree_lifecycle_owner, xy2.b.r(view2));
        setTag(com.garmin.android.apps.connectmobile.R.id.view_tree_view_model_store_owner, zf.b.s(view2));
        setTag(com.garmin.android.apps.connectmobile.R.id.view_tree_saved_state_registry_owner, gl1.y.p(view2));
        setTag(com.garmin.android.apps.connectmobile.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        Object systemService = view2.getContext().getSystemService("window");
        systemService.getClass();
        this.f119d = (WindowManager) systemService;
        c.f70a.getClass();
        this.f120e = p3.p0.n(c.f71b);
    }

    @Override // kotlin.a
    public final void Content(p3.m mVar, int i14) {
        p3.o0 o0VarE = mVar.E(-909985810);
        ((e23.p) this.f120e.getF182175a()).invoke(o0VarE, 0);
        p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new k(this, i14, 0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        keyEvent.getClass();
        if (keyEvent.getKeyCode() == 4) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.f116a.invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // kotlin.a
    /* JADX INFO: renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getF121f() {
        return this.f121f;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }
}
