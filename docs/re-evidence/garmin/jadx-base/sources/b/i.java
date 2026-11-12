package b;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.b0;
import androidx.lifecycle.n0;
import androidx.lifecycle.o0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u001b\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0003\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\fH\u0015¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0010H\u0015¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ!\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u0018\u0010\u001fJ!\u0010 \u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\u0010H\u0017¢\u0006\u0004\b!\u0010\u0014R\u0018\u0010#\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R!\u00103\u001a\u00020.8FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b/\u0010*\u0012\u0004\b2\u0010\u0014\u001a\u0004\b0\u00101R\u0014\u00106\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010B\u001a\u00020?8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A¨\u0006C"}, d2 = {"Lb/i;", "Landroid/app/Dialog;", "Landroidx/lifecycle/n0;", "Lb/w;", "Lwc/d;", "Lnd/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "themeResId", "<init>", "(Landroid/content/Context;I)V", "Landroid/os/Bundle;", "onSaveInstanceState", "()Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "()V", "onStop", "onBackPressed", "layoutResID", "setContentView", "(I)V", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroidx/lifecycle/o0;", "_lifecycleRegistry", "Landroidx/lifecycle/o0;", "Lnd/d;", "savedStateRegistryController", "Lnd/d;", "Lwc/a;", "onBackPressedInput$delegate", "Lo13/l;", "getOnBackPressedInput", "()Lwc/a;", "onBackPressedInput", "Lb/u;", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Lb/u;", "getOnBackPressedDispatcher$annotations", "onBackPressedDispatcher", "getLifecycleRegistry", "()Landroidx/lifecycle/o0;", "lifecycleRegistry", "Lnd/c;", "getSavedStateRegistry", "()Lnd/c;", "savedStateRegistry", "Landroidx/lifecycle/b0;", "getLifecycle", "()Landroidx/lifecycle/b0;", "lifecycle", "Lwc/c;", "getNavigationEventDispatcher", "()Lwc/c;", "navigationEventDispatcher", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class i extends Dialog implements n0, w, wc.d, nd.e {
    private o0 _lifecycleRegistry;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final o13.l onBackPressedDispatcher;

    /* JADX INFO: renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    private final o13.l onBackPressedInput;
    private final nd.d savedStateRegistryController;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, int i14) {
        super(context, i14);
        context.getClass();
        nd.d.f125385c.getClass();
        this.savedStateRegistryController = nd.d.a.a(this);
        final int i15 = 0;
        this.onBackPressedInput = o13.m.b(new e23.a(this) { // from class: b.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f13808b;

            {
                this.f13808b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i15) {
                    case 0:
                        return i.onBackPressedInput_delegate$lambda$0(this.f13808b);
                    default:
                        return i.onBackPressedDispatcher_delegate$lambda$0(this.f13808b);
                }
            }
        });
        final int i16 = 1;
        this.onBackPressedDispatcher = o13.m.b(new e23.a(this) { // from class: b.h

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ i f13808b;

            {
                this.f13808b = this;
            }

            @Override // e23.a
            public final Object invoke() {
                switch (i16) {
                    case 0:
                        return i.onBackPressedInput_delegate$lambda$0(this.f13808b);
                    default:
                        return i.onBackPressedDispatcher_delegate$lambda$0(this.f13808b);
                }
            }
        });
    }

    private final o0 getLifecycleRegistry() {
        o0 o0Var = this._lifecycleRegistry;
        if (o0Var != null) {
            return o0Var;
        }
        o0 o0Var2 = new o0(this);
        this._lifecycleRegistry = o0Var2;
        return o0Var2;
    }

    public static /* synthetic */ void getOnBackPressedDispatcher$annotations() {
    }

    private final wc.a getOnBackPressedInput() {
        return (wc.a) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u onBackPressedDispatcher_delegate$lambda$0(i iVar) {
        return new u(new a0.c(iVar, 18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wc.a onBackPressedInput_delegate$lambda$0(i iVar) {
        wc.a aVar = new wc.a();
        iVar.getNavigationEventDispatcher().b(aVar);
        return aVar;
    }

    @Override // android.app.Dialog
    public void addContentView(View view2, ViewGroup.LayoutParams params) {
        view2.getClass();
        initializeViewTreeOwners();
        super.addContentView(view2, params);
    }

    @Override // androidx.lifecycle.n0
    /* JADX INFO: renamed from: getLifecycle */
    public b0 getF158016a() {
        return getLifecycleRegistry();
    }

    @Override // wc.d
    public wc.c getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().c().f13827c;
    }

    @Override // b.w
    public final u getOnBackPressedDispatcher() {
        return (u) this.onBackPressedDispatcher.getValue();
    }

    @Override // nd.e
    public nd.c getSavedStateRegistry() {
        return this.savedStateRegistryController.f125387b;
    }

    public void initializeViewTreeOwners() {
        Window window = getWindow();
        window.getClass();
        View decorView = window.getDecorView();
        decorView.getClass();
        decorView.setTag(R.id.view_tree_lifecycle_owner, this);
        Window window2 = getWindow();
        window2.getClass();
        View decorView2 = window2.getDecorView();
        decorView2.getClass();
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        window3.getClass();
        View decorView3 = window3.getDecorView();
        decorView3.getClass();
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        window4.getClass();
        View decorView4 = window4.getDecorView();
        decorView4.getClass();
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // android.app.Dialog
    @o13.e
    public void onBackPressed() {
        getOnBackPressedInput().a();
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (Build.VERSION.SDK_INT >= 33) {
            u onBackPressedDispatcher = getOnBackPressedDispatcher();
            OnBackInvokedDispatcher onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            onBackInvokedDispatcher.getClass();
            onBackPressedDispatcher.e(onBackInvokedDispatcher);
        }
        this.savedStateRegistryController.a(savedInstanceState);
        getLifecycleRegistry().g(b0.a.ON_CREATE);
    }

    @Override // android.app.Dialog
    public Bundle onSaveInstanceState() {
        Bundle bundleOnSaveInstanceState = super.onSaveInstanceState();
        bundleOnSaveInstanceState.getClass();
        this.savedStateRegistryController.b(bundleOnSaveInstanceState);
        return bundleOnSaveInstanceState;
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        getLifecycleRegistry().g(b0.a.ON_RESUME);
    }

    @Override // android.app.Dialog
    public void onStop() {
        getLifecycleRegistry().g(b0.a.ON_DESTROY);
        this._lifecycleRegistry = null;
        super.onStop();
    }

    @Override // android.app.Dialog
    public void setContentView(View view2) {
        view2.getClass();
        initializeViewTreeOwners();
        super.setContentView(view2);
    }

    @Override // android.app.Dialog
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        super.setContentView(layoutResID);
    }

    @Override // android.app.Dialog
    public void setContentView(View view2, ViewGroup.LayoutParams params) {
        view2.getClass();
        initializeViewTreeOwners();
        super.setContentView(view2, params);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        this(context, 0, 2, null);
        context.getClass();
    }

    public /* synthetic */ i(Context context, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? 0 : i14);
    }
}
