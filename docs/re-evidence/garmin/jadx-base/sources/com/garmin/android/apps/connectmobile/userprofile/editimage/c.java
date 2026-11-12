package com.garmin.android.apps.connectmobile.userprofile.editimage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.yalantis.ucrop.view.GestureCropImageView;
import com.yalantis.ucrop.view.OverlayView;
import com.yalantis.ucrop.view.UCropView;
import mh1.i;
import n12.d0;
import n12.e0;
import n12.x;
import n12.y;
import n12.z;
import o13.h;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.c0;
import o53.s0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.q;
import p005kotlin.jvm.internal.s;
import r53.p2;
import r53.q2;
import u53.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0002\b\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u0013²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\r\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u000e\u001a\u0004\u0018\u00010\f8\nX\u008a\u0084\u0002²\u0006\f\u0010\u000f\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0011\u001a\u00020\n8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0012\u001a\u00020\n8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/c;", "Lo53/b0;", "Landroid/view/ViewGroup;", "rootView", "Lcom/garmin/android/apps/connectmobile/userprofile/editimage/c$b;", "profileImageStateChangeListener", "<init>", "(Landroid/view/ViewGroup;Lcom/garmin/android/apps/connectmobile/userprofile/editimage/c$b;)V", "b", "a", "", "avatarVisible", "", "avatarModel", "frameModel", "isSubscriber", "isPreviewOnly", "avatarReady", "imageReady", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c implements b0 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final /* synthetic */ int f46657x = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ u53.d f46658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f46659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ComposeView f46660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final UCropView f46661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f46662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final View f46663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final View f46664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final View f46665h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final OverlayView f46666i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final t f46667j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public GestureCropImageView f46668k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f46669l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Runnable f46670m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Uri f46671n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i f46672o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p2 f46673p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final p2 f46674q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final p2 f46675r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p2 f46676t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final p2 f46677v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final p2 f46678w;

    public interface b {
        void a();

        void b();
    }

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.userprofile.editimage.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/editimage/c$c", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class ViewOnLayoutChangeListenerC0901c implements View.OnLayoutChangeListener {
        public ViewOnLayoutChangeListenerC0901c() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            view2.removeOnLayoutChangeListener(this);
            c cVar = c.this;
            cVar.f46669l = true;
            Runnable runnable = cVar.f46670m;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final /* synthetic */ class d implements zp0.a, n {
        public d() {
        }

        @Override // zp0.a
        public final void a(Bitmap bitmap) {
            int i14 = c.f46657x;
            c cVar = c.this;
            cVar.getClass();
            if (bitmap != null) {
                x53.c cVar2 = s0.f129406a;
                ge1.b.T(cVar, o.f168762a, null, new z(cVar, bitmap, null), 2);
            } else {
                i2.a aVar = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar.getClass();
                i2.a.f(a2Var, "EditProfileImageViewHolder", "loaded bitmap is null!!");
            }
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof zp0.a) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return new q(1, c.this, c.class, "onImageLoaded", "onImageLoaded(Landroid/graphics/Bitmap;)V", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/garmin/android/apps/connectmobile/userprofile/editimage/c$e", "Landroid/view/View$OnLayoutChangeListener;", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e implements View.OnLayoutChangeListener {
        public e() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view2, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25) {
            view2.removeOnLayoutChangeListener(this);
            c cVar = c.this;
            int measuredHeight = (cVar.f46661d.getMeasuredHeight() - cVar.f46660c.getMeasuredHeight()) / 2;
            cVar.f46666i.setPadding(measuredHeight, measuredHeight, measuredHeight, measuredHeight);
            cVar.f46666i.layout(1, 1, 1, 1);
            cVar.f46666i.requestLayout();
            cVar.f46666i.addOnLayoutChangeListener(cVar.new ViewOnLayoutChangeListenerC0901c());
        }
    }

    static {
        new a(null);
    }

    public c(ViewGroup viewGroup, b bVar) {
        viewGroup.getClass();
        bVar.getClass();
        this.f46658a = c0.b();
        this.f46659b = bVar;
        View viewFindViewById = viewGroup.findViewById(R.id.compose_view);
        viewFindViewById.getClass();
        ComposeView composeView = (ComposeView) viewFindViewById;
        this.f46660c = composeView;
        View viewFindViewById2 = viewGroup.findViewById(R.id.ucrop_view);
        viewFindViewById2.getClass();
        UCropView uCropView = (UCropView) viewFindViewById2;
        this.f46661d = uCropView;
        View viewFindViewById3 = viewGroup.findViewById(R.id.ucrop_view_mask);
        viewFindViewById3.getClass();
        this.f46662e = viewFindViewById3;
        View viewFindViewById4 = viewGroup.findViewById(R.id.tip_container);
        viewFindViewById4.getClass();
        this.f46663f = viewFindViewById4;
        View viewFindViewById5 = viewGroup.findViewById(R.id.tip_mask);
        viewFindViewById5.getClass();
        this.f46664g = viewFindViewById5;
        View viewFindViewById6 = viewGroup.findViewById(R.id.preview_only_container);
        viewFindViewById6.getClass();
        this.f46665h = viewFindViewById6;
        OverlayView overlayView = uCropView.getOverlayView();
        overlayView.getClass();
        this.f46666i = overlayView;
        this.f46667j = m.b(new i(this, 20));
        Boolean bool = Boolean.FALSE;
        this.f46673p = q2.a(bool);
        this.f46674q = q2.a(null);
        this.f46675r = q2.a(null);
        this.f46676t = q2.a(bool);
        this.f46677v = q2.a(bool);
        this.f46678w = q2.a(bool);
        viewFindViewById3.setOnTouchListener(new y(0));
        overlayView.setDimmedColor(uCropView.getContext().getColor(R.color.edit_profile_image_overlay_mask_color));
        overlayView.setCircleDimmedLayer(true);
        overlayView.setShowCropFrame(false);
        overlayView.setShowCropGrid(false);
        uCropView.setAlpha(0.0f);
        uCropView.addOnLayoutChangeListener(new e());
        TextView textView = (TextView) viewFindViewById6.findViewById(R.id.preview_msg);
        if (textView != null) {
            textView.setText(uCropView.getContext().getString(R.string.edit_profile_avatar_subscription_required_tip_message));
        }
        composeView.setContent(new z3.e(1357876273, true, new x(this, 0)));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object a(c cVar, Bitmap bitmap, v13.c cVar2) {
        d0 d0Var;
        cVar.getClass();
        if (cVar2 instanceof d0) {
            d0Var = (d0) cVar2;
            int i14 = d0Var.f122231c;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                d0Var.f122231c = i14 - Integer.MIN_VALUE;
            } else {
                d0Var = new d0(cVar, cVar2);
            }
        } else {
            d0Var = new d0(cVar, cVar2);
        }
        Object obj = d0Var.f122229a;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i15 = d0Var.f122231c;
        try {
            if (i15 == 0) {
                r.b(obj);
                x53.c cVar3 = s0.f129406a;
                x53.b bVar = x53.b.f189152a;
                e0 e0Var = new e0(cVar, bitmap, null);
                d0Var.f122231c = 1;
                if (ge1.b.e0(bVar, e0Var, d0Var) == aVar) {
                    return aVar;
                }
            } else {
                if (i15 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
        } catch (Exception e4) {
            String strN = fb1.c.n("store image with exception: ", e4.getMessage());
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "EditProfileImageViewHolder", strN);
        }
        return Unit.INSTANCE;
    }

    public final void b(Uri uri) {
        zp0.c.a aVar = zp0.c.f206560v;
        Context context = this.f46661d.getContext();
        context.getClass();
        aVar.getClass();
        zp0.c cVar = new zp0.c(context);
        uri.getClass();
        cVar.f206568h = uri;
        cVar.d(new d());
    }

    public final void c() {
        UCropView uCropView = this.f46661d;
        uCropView.resetCropImageView();
        GestureCropImageView cropImageView = uCropView.getCropImageView();
        cropImageView.getClass();
        cropImageView.setTransformImageListener(new com.garmin.android.apps.connectmobile.userprofile.editimage.d(cropImageView, this));
        cropImageView.setTargetAspectRatio(1.0f);
        cropImageView.setRotateEnabled(false);
        cropImageView.setMaxResultImageSizeX(1024);
        cropImageView.setMaxResultImageSizeY(1024);
        this.f46668k = cropImageView;
        Uri uri = this.f46671n;
        if (uri != null) {
            cropImageView.setImageUri(uri, (Uri) this.f46667j.getValue());
        } else {
            s.m("cropInputUri");
            throw null;
        }
    }

    @Override // o53.b0
    /* JADX INFO: renamed from: getCoroutineContext */
    public final t13.g getF183565a() {
        return this.f46658a.f168725a;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/c$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
