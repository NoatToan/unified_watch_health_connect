package qm0;

import am.c2;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.n0;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.w1;
import androidx.lifecycle.x1;
import androidx.lifecycle.y0;
import androidx.lifecycle.y1;
import androidx.lifecycle.z0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.garmin.android.apps.connectmobile.group.service.model.GroupDetailsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.l2;
import com.garmin.android.apps.connectmobile.social.VideoPlayerActivity;
import com.garmin.android.apps.connectmobile.social.conversation.ConversationActivity;
import ei0.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s0;
import p005kotlin.jvm.internal.t0;
import p13.h0;
import p13.j0;
import yc.u2;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lqm0/d;", "Lcom/garmin/android/apps/connectmobile/e0;", "", "Lwg0/a;", "Lxg0/o;", "Lxg0/n;", "Lxg0/a;", "<init>", "()V", "a", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public abstract class d extends com.garmin.android.apps.connectmobile.e0<String, wg0.a> implements xg0.o, xg0.n, xg0.a {
    public static final a E = new a(null);
    public static final List<c2> F = p13.x.k(c2.NEWS_POST, c2.ACTIVITY);
    public final f.c<Intent> A;
    public final f.c<Intent> B;
    public final f.c<Intent> C;
    public final f.c<Intent> D;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vg0.a f145489r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final iz0.a f145490t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final w1 f145491v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final w1 f145492w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public uo1.d f145493x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public View f145494y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ComposeView f145495z;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f145496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f145497b;

        static {
            int[] iArr = new int[fw.p.values().length];
            try {
                iArr[fw.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fw.p.ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[fw.p.LOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f145496a = iArr;
            int[] iArr2 = new int[c2.values().length];
            try {
                iArr2[c2.ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[c2.NEWS_POST.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f145497b = iArr2;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class c implements z0, p005kotlin.jvm.internal.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l f145498a;

        public c(e23.l lVar) {
            lVar.getClass();
            this.f145498a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof p005kotlin.jvm.internal.n)) {
                return p005kotlin.jvm.internal.s.g(getFunctionDelegate(), ((p005kotlin.jvm.internal.n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final o13.h<?> getFunctionDelegate() {
            return this.f145498a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f145498a.invoke(obj);
        }
    }

    /* JADX INFO: renamed from: qm0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class C2742d extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f145499a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C2742d(Fragment fragment) {
            super(0);
            this.f145499a = fragment;
        }

        @Override // e23.a
        public final y1 invoke() {
            return this.f145499a.requireActivity().getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f145500a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Fragment f145501b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(e23.a aVar, Fragment fragment) {
            super(0);
            this.f145500a = aVar;
            this.f145501b = fragment;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f145500a;
            return (aVar == null || (creationExtras = (CreationExtras) aVar.invoke()) == null) ? this.f145501b.requireActivity().getDefaultViewModelCreationExtras() : creationExtras;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f145502a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Fragment fragment) {
            super(0);
            this.f145502a = fragment;
        }

        @Override // e23.a
        public final x1.c invoke() {
            return this.f145502a.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/ViewModelStoreOwner;", "invoke", "()Landroidx/lifecycle/ViewModelStoreOwner;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<ViewModelStoreOwner> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f145503a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(e23.a aVar) {
            super(0);
            this.f145503a = aVar;
        }

        @Override // e23.a
        public final ViewModelStoreOwner invoke() {
            return (ViewModelStoreOwner) this.f145503a.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/y1;", "invoke", "()Landroidx/lifecycle/y1;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<y1> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o13.l f145504a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(o13.l lVar) {
            super(0);
            this.f145504a = lVar;
        }

        @Override // e23.a
        public final y1 invoke() {
            return ((ViewModelStoreOwner) this.f145504a.getValue()).getF189591b();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/viewmodel/CreationExtras;", "invoke", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<CreationExtras> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.a f145505a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f145506b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(e23.a aVar, o13.l lVar) {
            super(0);
            this.f145505a = aVar;
            this.f145506b = lVar;
        }

        @Override // e23.a
        public final CreationExtras invoke() {
            CreationExtras creationExtras;
            e23.a aVar = this.f145505a;
            if (aVar != null && (creationExtras = (CreationExtras) aVar.invoke()) != null) {
                return creationExtras;
            }
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f145506b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return yVar != null ? yVar.getDefaultViewModelCreationExtras() : CreationExtras.b.f8056c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/u1;", "VM", "Landroidx/lifecycle/x1$c;", "invoke", "()Landroidx/lifecycle/x1$c;", "<anonymous>"}, k = 3, mv = {2, 3, 0})
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<x1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Fragment f145507a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o13.l f145508b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Fragment fragment, o13.l lVar) {
            super(0);
            this.f145507a = fragment;
            this.f145508b = lVar;
        }

        @Override // e23.a
        public final x1.c invoke() {
            x1.c defaultViewModelProviderFactory;
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) this.f145508b.getValue();
            androidx.lifecycle.y yVar = viewModelStoreOwner instanceof androidx.lifecycle.y ? (androidx.lifecycle.y) viewModelStoreOwner : null;
            return (yVar == null || (defaultViewModelProviderFactory = yVar.getDefaultViewModelProviderFactory()) == null) ? this.f145507a.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public d() {
        super(true);
        this.f145489r = (vg0.a) KoinJavaComponent.get$default(vg0.a.class, null, null, 6, null);
        this.f145490t = (iz0.a) KoinJavaComponent.get$default(iz0.a.class, null, null, 6, null);
        t0 t0Var = s0.f105811a;
        this.f145491v = new w1(t0Var.b(mm0.e.class), new C2742d(this), new f(this), new e(null, this));
        o13.l lVarA = o13.m.a(o13.n.NONE, new g(new q42.d(this, 12)));
        this.f145492w = new w1(t0Var.b(w.class), new h(lVarA), new j(this, lVarA), new i(null, lVarA));
        final int i14 = 0;
        f.c<Intent> cVarRegisterForActivityResult = registerForActivityResult(new g.h(), new f.b(this) { // from class: qm0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f145486b;

            {
                this.f145486b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                List listB1;
                Intent intent2;
                int i15 = i14;
                d dVar = this.f145486b;
                f.a aVar = (f.a) obj;
                switch (i15) {
                    case 0:
                        d.a aVar2 = d.E;
                        aVar.getClass();
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.k(a2Var, "BaseGroupPostFragment", "View feed detail activity result");
                        if (aVar.f67585a == -1) {
                            Intent intent3 = aVar.f67586b;
                            c2 c2Var = null;
                            String stringExtra = intent3 != null ? intent3.getStringExtra("GCM_conversation_resource_id") : null;
                            String stringExtra2 = intent3 != null ? intent3.getStringExtra("GCM_conversation_resource_type") : null;
                            for (c2 c2Var2 : c2.values()) {
                                if (p005kotlin.jvm.internal.s.g(c2Var2.name(), stringExtra2)) {
                                    c2Var = c2Var2;
                                    dVar.Y6().f145569d.j(new v(stringExtra, c2Var));
                                }
                                break;
                            }
                            dVar.Y6().f145569d.j(new v(stringExtra, c2Var));
                        }
                        break;
                    case 1:
                        d.a aVar4 = d.E;
                        aVar.getClass();
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.k(a2Var2, "BaseGroupPostFragment", "View activity image result");
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            long longExtra = intent.getLongExtra("GCM_conversation_resource_id", -1L);
                            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            y0<a> y0Var = dVar.Y6().f145570e;
                            if (parcelableArrayListExtra == null || (listB1 = h0.b1(parcelableArrayListExtra)) == null) {
                                listB1 = j0.f134944a;
                            }
                            y0Var.j(new a(longExtra, listB1));
                            break;
                        }
                        break;
                    case 2:
                        d.a aVar6 = d.E;
                        aVar.getClass();
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.k(a2Var3, "BaseGroupPostFragment", "View post feed image result");
                        if (aVar.f67585a == -1 && (intent2 = aVar.f67586b) != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            dVar.Y6().f145571f.j(new c0(intent2.getStringExtra("GCM_conversation_resource_id"), Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", jo1.f.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data")));
                            break;
                        }
                        break;
                    default:
                        d.a aVar8 = d.E;
                        aVar.getClass();
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.k(a2Var4, "BaseGroupPostFragment", "View video result");
                        if (aVar.f67585a == -1) {
                            Intent intent4 = aVar.f67586b;
                            dVar.Y6().f145574i.j(new d0(intent4 != null ? intent4.getLongExtra("GCM_extra_activity_id", -1L) : -1L));
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult.getClass();
        this.A = cVarRegisterForActivityResult;
        final int i15 = 1;
        f.c<Intent> cVarRegisterForActivityResult2 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qm0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f145486b;

            {
                this.f145486b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                List listB1;
                Intent intent2;
                int i16 = i15;
                d dVar = this.f145486b;
                f.a aVar = (f.a) obj;
                switch (i16) {
                    case 0:
                        d.a aVar2 = d.E;
                        aVar.getClass();
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.k(a2Var, "BaseGroupPostFragment", "View feed detail activity result");
                        if (aVar.f67585a == -1) {
                            Intent intent3 = aVar.f67586b;
                            c2 c2Var = null;
                            String stringExtra = intent3 != null ? intent3.getStringExtra("GCM_conversation_resource_id") : null;
                            String stringExtra2 = intent3 != null ? intent3.getStringExtra("GCM_conversation_resource_type") : null;
                            for (c2 c2Var2 : c2.values()) {
                                if (p005kotlin.jvm.internal.s.g(c2Var2.name(), stringExtra2)) {
                                    c2Var = c2Var2;
                                    dVar.Y6().f145569d.j(new v(stringExtra, c2Var));
                                }
                                break;
                            }
                            dVar.Y6().f145569d.j(new v(stringExtra, c2Var));
                        }
                        break;
                    case 1:
                        d.a aVar4 = d.E;
                        aVar.getClass();
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.k(a2Var2, "BaseGroupPostFragment", "View activity image result");
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            long longExtra = intent.getLongExtra("GCM_conversation_resource_id", -1L);
                            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            y0<a> y0Var = dVar.Y6().f145570e;
                            if (parcelableArrayListExtra == null || (listB1 = h0.b1(parcelableArrayListExtra)) == null) {
                                listB1 = j0.f134944a;
                            }
                            y0Var.j(new a(longExtra, listB1));
                            break;
                        }
                        break;
                    case 2:
                        d.a aVar6 = d.E;
                        aVar.getClass();
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.k(a2Var3, "BaseGroupPostFragment", "View post feed image result");
                        if (aVar.f67585a == -1 && (intent2 = aVar.f67586b) != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            dVar.Y6().f145571f.j(new c0(intent2.getStringExtra("GCM_conversation_resource_id"), Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", jo1.f.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data")));
                            break;
                        }
                        break;
                    default:
                        d.a aVar8 = d.E;
                        aVar.getClass();
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.k(a2Var4, "BaseGroupPostFragment", "View video result");
                        if (aVar.f67585a == -1) {
                            Intent intent4 = aVar.f67586b;
                            dVar.Y6().f145574i.j(new d0(intent4 != null ? intent4.getLongExtra("GCM_extra_activity_id", -1L) : -1L));
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult2.getClass();
        this.B = cVarRegisterForActivityResult2;
        final int i16 = 2;
        f.c<Intent> cVarRegisterForActivityResult3 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qm0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f145486b;

            {
                this.f145486b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                List listB1;
                Intent intent2;
                int i17 = i16;
                d dVar = this.f145486b;
                f.a aVar = (f.a) obj;
                switch (i17) {
                    case 0:
                        d.a aVar2 = d.E;
                        aVar.getClass();
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.k(a2Var, "BaseGroupPostFragment", "View feed detail activity result");
                        if (aVar.f67585a == -1) {
                            Intent intent3 = aVar.f67586b;
                            c2 c2Var = null;
                            String stringExtra = intent3 != null ? intent3.getStringExtra("GCM_conversation_resource_id") : null;
                            String stringExtra2 = intent3 != null ? intent3.getStringExtra("GCM_conversation_resource_type") : null;
                            for (c2 c2Var2 : c2.values()) {
                                if (p005kotlin.jvm.internal.s.g(c2Var2.name(), stringExtra2)) {
                                    c2Var = c2Var2;
                                    dVar.Y6().f145569d.j(new v(stringExtra, c2Var));
                                }
                                break;
                            }
                            dVar.Y6().f145569d.j(new v(stringExtra, c2Var));
                        }
                        break;
                    case 1:
                        d.a aVar4 = d.E;
                        aVar.getClass();
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.k(a2Var2, "BaseGroupPostFragment", "View activity image result");
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            long longExtra = intent.getLongExtra("GCM_conversation_resource_id", -1L);
                            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            y0<a> y0Var = dVar.Y6().f145570e;
                            if (parcelableArrayListExtra == null || (listB1 = h0.b1(parcelableArrayListExtra)) == null) {
                                listB1 = j0.f134944a;
                            }
                            y0Var.j(new a(longExtra, listB1));
                            break;
                        }
                        break;
                    case 2:
                        d.a aVar6 = d.E;
                        aVar.getClass();
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.k(a2Var3, "BaseGroupPostFragment", "View post feed image result");
                        if (aVar.f67585a == -1 && (intent2 = aVar.f67586b) != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            dVar.Y6().f145571f.j(new c0(intent2.getStringExtra("GCM_conversation_resource_id"), Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", jo1.f.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data")));
                            break;
                        }
                        break;
                    default:
                        d.a aVar8 = d.E;
                        aVar.getClass();
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.k(a2Var4, "BaseGroupPostFragment", "View video result");
                        if (aVar.f67585a == -1) {
                            Intent intent4 = aVar.f67586b;
                            dVar.Y6().f145574i.j(new d0(intent4 != null ? intent4.getLongExtra("GCM_extra_activity_id", -1L) : -1L));
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult3.getClass();
        this.C = cVarRegisterForActivityResult3;
        final int i17 = 3;
        f.c<Intent> cVarRegisterForActivityResult4 = registerForActivityResult(new g.h(), new f.b(this) { // from class: qm0.c

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f145486b;

            {
                this.f145486b = this;
            }

            @Override // f.b
            public final void a(Object obj) {
                Intent intent;
                List listB1;
                Intent intent2;
                int i18 = i17;
                d dVar = this.f145486b;
                f.a aVar = (f.a) obj;
                switch (i18) {
                    case 0:
                        d.a aVar2 = d.E;
                        aVar.getClass();
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.k(a2Var, "BaseGroupPostFragment", "View feed detail activity result");
                        if (aVar.f67585a == -1) {
                            Intent intent3 = aVar.f67586b;
                            c2 c2Var = null;
                            String stringExtra = intent3 != null ? intent3.getStringExtra("GCM_conversation_resource_id") : null;
                            String stringExtra2 = intent3 != null ? intent3.getStringExtra("GCM_conversation_resource_type") : null;
                            for (c2 c2Var2 : c2.values()) {
                                if (p005kotlin.jvm.internal.s.g(c2Var2.name(), stringExtra2)) {
                                    c2Var = c2Var2;
                                    dVar.Y6().f145569d.j(new v(stringExtra, c2Var));
                                }
                                break;
                            }
                            dVar.Y6().f145569d.j(new v(stringExtra, c2Var));
                        }
                        break;
                    case 1:
                        d.a aVar4 = d.E;
                        aVar.getClass();
                        i2.a aVar5 = i2.f36769a;
                        a2 a2Var2 = a2.GENERAL;
                        aVar5.getClass();
                        i2.a.k(a2Var2, "BaseGroupPostFragment", "View activity image result");
                        if (aVar.f67585a == -1 && (intent = aVar.f67586b) != null && intent.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            long longExtra = intent.getLongExtra("GCM_conversation_resource_id", -1L);
                            ArrayList parcelableArrayListExtra = Build.VERSION.SDK_INT >= 33 ? intent.getParcelableArrayListExtra("GCM_extra_images_data", ps.j.class) : intent.getParcelableArrayListExtra("GCM_extra_images_data");
                            y0<a> y0Var = dVar.Y6().f145570e;
                            if (parcelableArrayListExtra == null || (listB1 = h0.b1(parcelableArrayListExtra)) == null) {
                                listB1 = j0.f134944a;
                            }
                            y0Var.j(new a(longExtra, listB1));
                            break;
                        }
                        break;
                    case 2:
                        d.a aVar6 = d.E;
                        aVar.getClass();
                        i2.a aVar7 = i2.f36769a;
                        a2 a2Var3 = a2.GENERAL;
                        aVar7.getClass();
                        i2.a.k(a2Var3, "BaseGroupPostFragment", "View post feed image result");
                        if (aVar.f67585a == -1 && (intent2 = aVar.f67586b) != null && intent2.getBooleanExtra("GCM_extra_image_list_changed", false)) {
                            dVar.Y6().f145571f.j(new c0(intent2.getStringExtra("GCM_conversation_resource_id"), Build.VERSION.SDK_INT >= 33 ? intent2.getParcelableArrayListExtra("GCM_extra_images_data", jo1.f.class) : intent2.getParcelableArrayListExtra("GCM_extra_images_data")));
                            break;
                        }
                        break;
                    default:
                        d.a aVar8 = d.E;
                        aVar.getClass();
                        i2.a aVar9 = i2.f36769a;
                        a2 a2Var4 = a2.GENERAL;
                        aVar9.getClass();
                        i2.a.k(a2Var4, "BaseGroupPostFragment", "View video result");
                        if (aVar.f67585a == -1) {
                            Intent intent4 = aVar.f67586b;
                            dVar.Y6().f145574i.j(new d0(intent4 != null ? intent4.getLongExtra("GCM_extra_activity_id", -1L) : -1L));
                        }
                        break;
                }
            }
        });
        cVarRegisterForActivityResult4.getClass();
        this.D = cVarRegisterForActivityResult4;
    }

    @Override // xg0.o
    public final void G(wg0.a aVar) {
        aVar.getClass();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xg0.a
    public final void G1(wg0.a aVar) {
        o13.p pVar;
        wg0.m mVar = aVar.f185060t;
        if (aVar.m()) {
            pVar = new o13.p(mVar != null ? mVar.f185111d : null, mVar != null ? mVar.f185110c : null);
        } else {
            if (!aVar.h()) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var, "BaseGroupPostFragment", "Unlike ActivityFeed with unsupported type.\n " + aVar);
                return;
            }
            pVar = new o13.p(mVar != null ? mVar.f185111d : null, mVar != null ? mVar.f185110c : null);
        }
        String str = (String) pVar.f128594a;
        Long l14 = (Long) pVar.f128595b;
        p pVarD7 = d7();
        pVarD7.getClass();
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new u(str, l14, pVarD7, null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new c(new qm0.b(this, aVar, 1)));
    }

    @Override // xg0.a
    public final void J0(wg0.a aVar) {
        aVar.getClass();
        c2 c2VarG = aVar.g();
        if (c2VarG == null || !F.contains(c2VarG)) {
            String strN = fb1.c.n("Unsupported resource type: ", c2VarG != null ? c2VarG.name() : null);
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "BaseGroupPostFragment", strN);
            return;
        }
        String strF = aVar.f();
        if (strF == null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var2, "BaseGroupPostFragment", "Invalid resource id");
            return;
        }
        ConversationActivity.a aVar4 = ConversationActivity.f44530c;
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        long jB4 = c7().B4();
        aVar4.getClass();
        requireActivity().startActivity(ConversationActivity.a.f(mVarRequireActivity, jB4, c2VarG, strF));
    }

    @Override // xg0.o
    public final void L5(String str) {
        str.getClass();
    }

    @Override // com.garmin.android.apps.connectmobile.e0
    public final u2 M6() {
        return new u2(10, 0, false, 0, 0, 0, 58, null);
    }

    @Override // xg0.n
    public final void R3(wg0.k kVar) {
        VideoPlayerActivity.a aVar = VideoPlayerActivity.f44499a;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        aVar.getClass();
        this.D.a(VideoPlayerActivity.a.a(contextRequireContext, kVar), null);
    }

    @Override // xg0.n
    public final void S2(com.garmin.android.library.mapsdkadapter.i.d dVar, int i14) {
        dVar.getClass();
        androidx.fragment.app.m mVarRequireActivity = requireActivity();
        mVarRequireActivity.getClass();
        this.f145489r.c(mVarRequireActivity, dVar, i14);
    }

    @Override // xg0.o
    public final void T5(String str) {
        str.getClass();
    }

    @Override // xg0.o
    public final void V3(String str, String str2) {
        str.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        this.f145489r.b(contextRequireContext, str, str2);
    }

    @Override // xg0.o
    public final void W5(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // xg0.a
    public final void Y1(wg0.a aVar) {
        aVar.getClass();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.k(a2Var, "BaseGroupPostFragment", "onTotalCommentClicked: item=[" + aVar + " ]");
        i7(aVar, false);
    }

    public final w Y6() {
        return (w) this.f145492w.getValue();
    }

    @Override // xg0.o
    public final void c4(String str) {
        str.getClass();
    }

    public final mm0.e c7() {
        return (mm0.e) this.f145491v.getValue();
    }

    public abstract p d7();

    public final ComposeView e7() {
        ComposeView composeView = this.f145495z;
        if (composeView != null) {
            return composeView;
        }
        p005kotlin.jvm.internal.s.m("noDataStatsView");
        throw null;
    }

    public final View f7() {
        View view2 = this.f145494y;
        if (view2 != null) {
            return view2;
        }
        p005kotlin.jvm.internal.s.m("runningLoadingView");
        throw null;
    }

    public final void g7() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.k(a2Var, "BaseGroupPostFragment", "hideEmptyView");
        e7().setVisibility(8);
        T6().setVisibility(0);
    }

    public void h7(View view2) {
        View viewFindViewById = view2.findViewById(R.id.loading_view);
        viewFindViewById.getClass();
        this.f145493x = (uo1.d) viewFindViewById;
        View viewFindViewById2 = view2.findViewById(R.id.progress_view);
        viewFindViewById2.getClass();
        this.f145494y = viewFindViewById2;
    }

    @Override // xg0.o
    public final void i1(wg0.a aVar) {
        aVar.getClass();
    }

    @Override // xg0.a
    public final void i2(wg0.a aVar) {
        aVar.getClass();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.k(a2Var, "BaseGroupPostFragment", "onHighlightedCommentClicked: item=[" + aVar + " ]");
        i7(aVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i7(wg0.a aVar, boolean z14) {
        o13.u uVar;
        GroupDTO.c cVar;
        if (aVar.h()) {
            uVar = new o13.u(c2.ACTIVITY, String.valueOf(aVar.f185042a), Boolean.valueOf(aVar.j()));
        } else {
            if (!aVar.m()) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.f(a2Var, "BaseGroupPostFragment", "Unsupported activity feed: " + aVar);
                return;
            }
            c2 c2Var = c2.NEWS_POST;
            jo1.e eVar = aVar.f185061v;
            eVar.getClass();
            uVar = new o13.u(c2Var, eVar.getUuid(), Boolean.valueOf(aVar.k()));
        }
        c2 c2Var2 = (c2) uVar.f128605a;
        String str = (String) uVar.f128606b;
        boolean zBooleanValue = ((Boolean) uVar.f128607c).booleanValue();
        ConversationActivity.a aVar3 = ConversationActivity.f44530c;
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        long jB4 = c7().B4();
        boolean z15 = zBooleanValue || (cVar = aVar.f185062w) == GroupDTO.c.ADMIN || cVar == GroupDTO.c.OWNER;
        aVar3.getClass();
        c2Var2.getClass();
        str.getClass();
        Intent intent = new Intent(contextRequireContext, (Class<?>) ConversationActivity.class);
        intent.setAction("GCM_action_view_group_comments");
        com.airbnb.lottie.animation.keyframe.a.q(l2.f37135b, intent, h7.c.a(new o13.p("GCM_extra_connection_group_id", Long.valueOf(jB4)), new o13.p("GCM_conversation_resource_type", c2Var2.name()), new o13.p("GCM_conversation_resource_id", str), new o13.p("GCM_news_feed_item", aVar), new o13.p("GCM_conversation_is_my_activity", Boolean.valueOf(z15)), new o13.p("GCM_conversation_open_keyboard", Boolean.valueOf(z14))));
        this.A.a(intent, null);
    }

    public void j7() {
    }

    public void m7(x.b bVar) {
        bVar.getClass();
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.k(a2Var, "BaseGroupPostFragment", "onNewPostCreated");
        M7();
    }

    public final void n7() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BaseGroupPostFragment", "scrollToTop");
        T6().scrollToPosition(0);
    }

    @Override // xg0.n
    public final void o4(wg0.a aVar, ie2.c cVar) {
        aVar.getClass();
        Long l14 = aVar.f185042a;
        if (l14 != null) {
            long jLongValue = l14.longValue();
            androidx.fragment.app.m mVarRequireActivity = requireActivity();
            mVarRequireActivity.getClass();
            this.f145489r.d(mVarRequireActivity, jLongValue, aVar.f185043b, aVar.f185044c);
        }
    }

    public final void o7() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "BaseGroupPostFragment", "showEmptyView");
        e7().setVisibility(0);
        T6().setVisibility(4);
    }

    @Override // com.garmin.android.apps.connectmobile.e0, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        GroupDTO.c cVar;
        view2.getClass();
        super.onViewCreated(view2, bundle);
        h7(view2);
        d7().f145526b = c7().B4();
        p pVarD7 = d7();
        GroupDetailsDTO groupDetailsDTO = c7().f119507c;
        if (groupDetailsDTO == null || (cVar = groupDetailsDTO.f31578w) == null) {
            cVar = GroupDTO.c.NOT_DEFINED;
        }
        if (cVar == null) {
            cVar = GroupDTO.c.NOT_DEFINED;
        }
        pVarD7.getClass();
        cVar.getClass();
        pVarD7.f145527c = cVar;
        y0<wg0.a> y0Var = Y6().f145567b;
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(y0Var, viewLifecycleOwner, new c(new qm0.e(d7())));
        y0<x.b> y0Var2 = Y6().f145566a;
        n0 viewLifecycleOwner2 = getViewLifecycleOwner();
        viewLifecycleOwner2.getClass();
        dh.b.L(y0Var2, viewLifecycleOwner2, new c(new qm0.f(this)));
        y0<v> y0Var3 = Y6().f145569d;
        n0 viewLifecycleOwner3 = getViewLifecycleOwner();
        viewLifecycleOwner3.getClass();
        dh.b.L(y0Var3, viewLifecycleOwner3, new c(new qm0.g(this)));
        y0<qm0.a> y0Var4 = Y6().f145570e;
        n0 viewLifecycleOwner4 = getViewLifecycleOwner();
        viewLifecycleOwner4.getClass();
        dh.b.L(y0Var4, viewLifecycleOwner4, new c(new qm0.h(this)));
        y0<c0> y0Var5 = Y6().f145571f;
        n0 viewLifecycleOwner5 = getViewLifecycleOwner();
        viewLifecycleOwner5.getClass();
        dh.b.L(y0Var5, viewLifecycleOwner5, new c(new qm0.i(this)));
        y0<b0> y0Var6 = Y6().f145572g;
        n0 viewLifecycleOwner6 = getViewLifecycleOwner();
        viewLifecycleOwner6.getClass();
        dh.b.L(y0Var6, viewLifecycleOwner6, new c(new qm0.j(this)));
        y0<e0> y0Var7 = Y6().f145573h;
        n0 viewLifecycleOwner7 = getViewLifecycleOwner();
        viewLifecycleOwner7.getClass();
        dh.b.L(y0Var7, viewLifecycleOwner7, new c(new k(this)));
        y0<d0> y0Var8 = Y6().f145574i;
        n0 viewLifecycleOwner8 = getViewLifecycleOwner();
        viewLifecycleOwner8.getClass();
        dh.b.L(y0Var8, viewLifecycleOwner8, new c(new l(this)));
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        X6(contextRequireContext);
        j7();
        c22.l2<GroupDetailsDTO> l2Var = c7().f119513i;
        n0 viewLifecycleOwner9 = getViewLifecycleOwner();
        viewLifecycleOwner9.getClass();
        dh.b.L(l2Var, viewLifecycleOwner9, new c(new qd0.a(this, 19)));
    }

    @Override // xg0.a
    public final void p2(wg0.a aVar) {
        aVar.getClass();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.k(a2Var, "BaseGroupPostFragment", "onHighlightedCommentClicked: item=[" + aVar + " ]");
        i7(aVar, true);
    }

    @Override // xg0.a
    public final void r1(wg0.a aVar, String str) {
        c2 c2Var;
        if (aVar.m()) {
            c2Var = c2.NEWS_POST;
        } else {
            if (!aVar.h()) {
                i2.a aVar2 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar2.getClass();
                i2.a.p(a2Var, "BaseGroupPostFragment", "Like ActivityFeed with unsupported type.\n " + aVar);
                return;
            }
            c2Var = c2.ACTIVITY;
        }
        p pVarD7 = d7();
        pVarD7.getClass();
        c2Var.getClass();
        androidx.lifecycle.j jVarA = androidx.lifecycle.m.a(null, new q(c2Var, pVarD7, str, null), 3);
        n0 viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        dh.b.L(jVarA, viewLifecycleOwner, new c(new qm0.b(this, aVar, 0)));
    }

    @Override // xg0.n
    public final void r6(wg0.a aVar, wg0.c cVar) {
        jo1.e eVar;
        Intent intentD;
        ArrayList arrayList;
        Intent intentS;
        List<wg0.c> list;
        aVar.getClass();
        if (!aVar.h()) {
            if (!aVar.m() || (eVar = aVar.f185061v) == null) {
                return;
            }
            String uuid = eVar.getUuid();
            List<jo1.f> listK = eVar.k();
            if (listK == null) {
                return;
            }
            int size = listK.size();
            iz0.a aVar2 = this.f145490t;
            if (size == 1) {
                androidx.fragment.app.m mVarRequireActivity = requireActivity();
                mVarRequireActivity.getClass();
                intentD = aVar2.p(mVarRequireActivity, uuid, listK, aVar.k());
            } else {
                androidx.fragment.app.m mVarRequireActivity2 = requireActivity();
                mVarRequireActivity2.getClass();
                intentD = aVar2.d(mVarRequireActivity2, uuid, listK, Boolean.valueOf(aVar.k()));
            }
            this.C.a(intentD, null);
            return;
        }
        ps.q qVar = aVar.f185057p;
        if (qVar == null) {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "BaseGroupPostFragment", "activityStatsBrief should not be null in ActivityFeed!!");
            i2.a.f(a2Var, "BaseGroupPostFragment", "activityFeed: " + aVar);
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            q0.b(contextRequireContext);
            return;
        }
        wg0.l lVar = aVar.f185059r;
        if (lVar == null || (list = lVar.f185103b) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(p13.y.r(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((wg0.c) it.next()).f185077b);
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "BaseGroupPostFragment", "NewsFeed should not call this callback if image list is empty");
            return;
        }
        int size2 = arrayList.size();
        iz0.a aVar5 = this.f145490t;
        if (size2 == 1) {
            ArrayList arrayList2 = arrayList;
            androidx.fragment.app.m mVarRequireActivity3 = requireActivity();
            mVarRequireActivity3.getClass();
            intentS = aVar5.h(mVarRequireActivity3, qVar, new ArrayList(arrayList2), cVar, aVar.j());
        } else {
            androidx.fragment.app.m mVarRequireActivity4 = requireActivity();
            mVarRequireActivity4.getClass();
            intentS = aVar5.s(mVarRequireActivity4, qVar, arrayList, Boolean.valueOf(aVar.j()));
        }
        this.B.a(intentS, null);
    }

    @Override // xg0.o
    public final void s3(wg0.a aVar) {
        aVar.getClass();
        if (aVar.h()) {
            Context contextRequireContext = requireContext();
            contextRequireContext.getClass();
            this.f145489r.e(contextRequireContext, aVar);
        } else if (aVar.m()) {
            i7(aVar, false);
        }
    }

    @Override // xg0.o
    public final void u4() {
    }

    @Override // xg0.o
    public final void w4(String str) {
        str.getClass();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lqm0/d$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
