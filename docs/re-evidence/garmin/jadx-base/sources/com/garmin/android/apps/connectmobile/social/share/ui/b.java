package com.garmin.android.apps.connectmobile.social.share.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.Action;
import com.bumptech.glide.j;
import com.garmin.android.gncs.NotificationConstants;
import java.util.List;
import p005kotlin.Metadata;
import p13.h0;
import ro1.k0;
import ro1.l0;
import so1.e;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/b;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lro1/l0;", "stickerModel", "", "setModel", "(Lro1/l0;)V", "Lcom/garmin/android/apps/connectmobile/social/share/ui/b$b;", "getStickerMetaInfo", "()Lcom/garmin/android/apps/connectmobile/social/share/ui/b$b;", "a", "b", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends AppCompatImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l0 f44728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f44729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f44730c;

    /* JADX INFO: renamed from: com.garmin.android.apps.connectmobile.social.share.ui.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/b$b;", "", "Lso1/e;", NotificationConstants.KEY_DATA_MIME_TYPE, "", Action.KEY_ATTRIBUTE, "<init>", "(Lso1/e;Ljava/lang/String;)V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class C0849b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e f44731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f44732b;

        public C0849b(e eVar, String str) {
            eVar.getClass();
            str.getClass();
            this.f44731a = eVar;
            this.f44732b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0849b)) {
                return false;
            }
            C0849b c0849b = (C0849b) obj;
            return this.f44731a == c0849b.f44731a && this.f44732b.equals(c0849b.f44732b);
        }

        public final int hashCode() {
            return this.f44732b.hashCode() + (this.f44731a.hashCode() * 31);
        }

        public final String toString() {
            return "StickerImageInfo(type=" + this.f44731a + ", key=" + this.f44732b + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"com/garmin/android/apps/connectmobile/social/share/ui/b$c", "Lnj/c;", "Landroid/graphics/drawable/Drawable;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c extends nj.c<Drawable> {
        public c() {
        }

        @Override // nj.h
        public final void a(Drawable drawable) {
        }

        @Override // nj.h
        public final void f(Object obj) {
            b bVar = b.this;
            bVar.setImageDrawable((Drawable) obj);
            float scaleX = bVar.getScaleX();
            float scaleY = bVar.getScaleY();
            androidx.dynamicanimation.animation.e eVar = new androidx.dynamicanimation.animation.e(bVar, androidx.dynamicanimation.animation.b.f6989m, scaleX);
            eVar.f6996b = scaleX * 1.05f;
            eVar.f6997c = true;
            eVar.f();
            androidx.dynamicanimation.animation.e eVar2 = new androidx.dynamicanimation.animation.e(bVar, androidx.dynamicanimation.animation.b.f6990n, scaleY);
            eVar2.f6996b = scaleY * 1.05f;
            eVar2.f6997c = true;
            eVar2.f();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        context.getClass();
        this.f44730c = new c();
    }

    public final C0849b getStickerMetaInfo() {
        List<k0> list;
        k0 k0Var;
        l0 l0Var = this.f44728a;
        e eVar = l0Var != null ? l0Var.f153986a : null;
        String str = (l0Var == null || (list = l0Var.f153988c) == null || (k0Var = (k0) h0.e0(this.f44729b, list)) == null) ? null : k0Var.f153982a;
        if (eVar == null || str == null) {
            return null;
        }
        return new C0849b(eVar, str);
    }

    public final void setModel(l0 stickerModel) {
        stickerModel.getClass();
        if (stickerModel.a()) {
            this.f44728a = stickerModel;
            j jVarJ = com.bumptech.glide.b.e(getContext()).d(Drawable.class).J(stickerModel.f153988c.get(0).f153983b);
            jVarJ.getClass();
            jVarJ.F(this.f44730c, null, jVarJ, qj.e.f144968a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/social/share/ui/b$a;", "", "<init>", "()V", "", "SCALE_FACTOR", "F", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ b(Context context, AttributeSet attributeSet, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this(context, (i15 & 2) != 0 ? null : attributeSet, (i15 & 4) != 0 ? 0 : i14);
    }
}
