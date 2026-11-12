package com.garmin.android.apps.connectmobile.userprofile.editimage;

import a22.j;
import a22.k;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.lifecycle.u1;
import androidx.lifecycle.v1;
import androidx.lifecycle.w0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import c80.q;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel;
import com.garmin.android.apps.connectmobile.userprofile.model.p;
import com.garmin.android.apps.connectmobile.v2;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import e23.l;
import gg1.v0;
import i3.e5;
import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import lc.u0;
import mz1.d0;
import n12.k0;
import n12.l0;
import n12.m0;
import o13.h;
import o13.m;
import o13.r;
import o13.t;
import o53.b0;
import o53.s0;
import o53.t1;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.n;
import p005kotlin.jvm.internal.s;
import p13.x;
import p13.y;
import u53.o;
import v13.i;
import zd0.j1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/EditProfileImageViewModel;", "Landroidx/lifecycle/u1;", "<init>", "()V", "UploadFailedException", "a", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class EditProfileImageViewModel extends u1 {
    public static final String[] M0;
    public final y0 A;
    public final t B;
    public final y0<Boolean> C;
    public final y0 D;
    public final y0<Boolean> E;
    public final y0 F;
    public final y0<Boolean> H0;
    public final w0 I;
    public final y0 I0;
    public Uri J0;
    public File K0;
    public boolean L0;
    public final y0<List<com.garmin.android.apps.connectmobile.userprofile.model.e>> P;
    public final w0 T;
    public final y0<Boolean> X;
    public final w0 Y;
    public final y0<Uri> Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public com.garmin.android.apps.connectmobile.userprofile.model.e f46596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qo1.c f46597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a22.a f46598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j f46599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f46600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m0 f46601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0<p> f46602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f46603h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final y0<f> f46604i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final y0 f46605j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final y0<com.garmin.android.apps.connectmobile.userprofile.model.e> f46606k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final y0 f46607k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y0 f46608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final y0<Boolean> f46609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final y0<Boolean> f46610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final y0 f46611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y0<Unit> f46612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y0 f46613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y0<Unit> f46614r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f46615t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y0<Exception> f46616v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final y0 f46617w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final y0<List<com.garmin.android.apps.connectmobile.userprofile.model.a>> f46618x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y0 f46619y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final y0<String> f46620z;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/EditProfileImageViewModel$UploadFailedException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "message", "", "<init>", "(Ljava/lang/String;)V", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class UploadFailedException extends Exception {
        public static final int $stable = 8;

        public UploadFailedException(String str) {
            super(str);
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    public static final class b implements z0, n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f46621a;

        public b(l lVar) {
            lVar.getClass();
            this.f46621a = lVar;
        }

        public final boolean equals(Object obj) {
            if ((obj instanceof z0) && (obj instanceof n)) {
                return s.g(getFunctionDelegate(), ((n) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // p005kotlin.jvm.internal.n
        public final h<?> getFunctionDelegate() {
            return this.f46621a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        @Override // androidx.lifecycle.z0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f46621a.invoke(obj);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel$updateFrameFeatureStatus$1", f = "EditProfileImageViewModel.kt", l = {153, ModuleDescriptor.MODULE_VERSION, 156, SyslogConstants.LOG_LOCAL4}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public j1 f46622a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46623b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f46624c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46625d;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
        @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel$updateFrameFeatureStatus$1$1", f = "EditProfileImageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
        public static final class a extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ EditProfileImageViewModel f46627a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ boolean f46628b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f46629c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EditProfileImageViewModel editProfileImageViewModel, boolean z14, boolean z15, t13.d<? super a> dVar) {
                super(2, dVar);
                this.f46627a = editProfileImageViewModel;
                this.f46628b = z14;
                this.f46629c = z15;
            }

            @Override // v13.a
            public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
                return new a(this.f46627a, this.f46628b, this.f46629c, dVar);
            }

            @Override // e23.p
            public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
                return ((a) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // v13.a
            public final Object invokeSuspend(Object obj) {
                u13.a aVar = u13.a.COROUTINE_SUSPENDED;
                r.b(obj);
                EditProfileImageViewModel editProfileImageViewModel = this.f46627a;
                editProfileImageViewModel.C.m(Boolean.valueOf(this.f46628b));
                editProfileImageViewModel.E.m(Boolean.valueOf(this.f46629c));
                return Unit.INSTANCE;
            }
        }

        public c(t13.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EditProfileImageViewModel.this.new c(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x007d  */
        /* JADX WARN: Code duplicated, block: B:24:0x007f  */
        /* JADX WARN: Code duplicated, block: B:28:0x0092  */
        /* JADX WARN: Code duplicated, block: B:30:0x0096  */
        /* JADX WARN: Code duplicated, block: B:34:0x00b4  */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
        
            if (r13 == r0) goto L36;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            j1 j1Var;
            int i14;
            boolean zBooleanValue;
            t1 t1Var;
            a aVar;
            boolean z14;
            int i15;
            boolean z15;
            Object objE0;
            u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
            int i16 = this.f46625d;
            EditProfileImageViewModel editProfileImageViewModel = EditProfileImageViewModel.this;
            if (i16 == 0) {
                r.b(obj);
                editProfileImageViewModel.f46610n.j(Boolean.TRUE);
                j1Var = (j1) KoinJavaComponent.get$default(j1.class, null, null, 6, null);
                q qVar = q.PROFILE_IMAGE_FRAME;
                this.f46622a = j1Var;
                this.f46625d = 1;
                obj = j1Var.j(qVar, this);
                if (obj != aVar2) {
                }
                return aVar2;
            }
            if (i16 == 1) {
                j1Var = this.f46622a;
                r.b(obj);
            } else {
                if (i16 == 2) {
                    i14 = this.f46623b;
                    r.b(obj);
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    x53.c cVar = s0.f129406a;
                    t1Var = o.f168762a;
                    if (i14 != 0) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    aVar = new a(editProfileImageViewModel, z14, zBooleanValue, null);
                    this.f46622a = null;
                    this.f46623b = i14;
                    this.f46624c = zBooleanValue;
                    this.f46625d = 3;
                    if (ge1.b.e0(t1Var, aVar, this) != aVar2) {
                        i15 = i14;
                        z15 = zBooleanValue;
                        if (i15 != 0) {
                        }
                        this.f46622a = null;
                        this.f46623b = i15;
                        this.f46624c = z15;
                        this.f46625d = 4;
                        String[] strArr = EditProfileImageViewModel.M0;
                        editProfileImageViewModel.getClass();
                        x53.c cVar2 = s0.f129406a;
                        objE0 = ge1.b.e0(x53.b.f189152a, new com.garmin.android.apps.connectmobile.userprofile.editimage.e(z, editProfileImageViewModel, null), this);
                        if (objE0 != aVar2) {
                            objE0 = Unit.INSTANCE;
                        }
                    }
                    return aVar2;
                }
                if (i16 == 3) {
                    z15 = this.f46624c;
                    i15 = this.f46623b;
                    r.b(obj);
                    boolean z16 = i15 != 0;
                    this.f46622a = null;
                    this.f46623b = i15;
                    this.f46624c = z15;
                    this.f46625d = 4;
                    String[] strArr2 = EditProfileImageViewModel.M0;
                    editProfileImageViewModel.getClass();
                    x53.c cVar3 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new com.garmin.android.apps.connectmobile.userprofile.editimage.e(z16, editProfileImageViewModel, null), this);
                    if (objE0 != aVar2) {
                        objE0 = Unit.INSTANCE;
                    }
                } else {
                    if (i16 != 4) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
            }
            return Unit.INSTANCE;
            int i17 = !(((c80.p) obj) instanceof c80.p.c) ? 1 : 0;
            q qVar2 = q.PROFILE_IMAGE_FRAME;
            this.f46622a = null;
            this.f46623b = i17;
            this.f46625d = 2;
            Object objL = j1Var.l(qVar2, this);
            if (objL != aVar2) {
                i14 = i17;
                obj = objL;
                zBooleanValue = ((Boolean) obj).booleanValue();
                x53.c cVar4 = s0.f129406a;
                t1Var = o.f168762a;
                if (i14 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                aVar = new a(editProfileImageViewModel, z14, zBooleanValue, null);
                this.f46622a = null;
                this.f46623b = i14;
                this.f46624c = zBooleanValue;
                this.f46625d = 3;
                if (ge1.b.e0(t1Var, aVar, this) != aVar2) {
                    i15 = i14;
                    z15 = zBooleanValue;
                    if (i15 != 0) {
                    }
                    this.f46622a = null;
                    this.f46623b = i15;
                    this.f46624c = z15;
                    this.f46625d = 4;
                    String[] strArr3 = EditProfileImageViewModel.M0;
                    editProfileImageViewModel.getClass();
                    x53.c cVar5 = s0.f129406a;
                    objE0 = ge1.b.e0(x53.b.f189152a, new com.garmin.android.apps.connectmobile.userprofile.editimage.e(z16, editProfileImageViewModel, null), this);
                    if (objE0 != aVar2) {
                        objE0 = Unit.INSTANCE;
                    }
                }
            }
            return aVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel$updateProfileWithPhoto$1", f = "EditProfileImageViewModel.kt", l = {548, 550}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f46631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Uri f46632c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f46633d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ EditProfileImageViewModel f46634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f46635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.h f46636g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Uri uri, Context context, EditProfileImageViewModel editProfileImageViewModel, String str, com.garmin.android.apps.connectmobile.userprofile.model.h hVar, t13.d<? super d> dVar) {
            super(2, dVar);
            this.f46632c = uri;
            this.f46633d = context;
            this.f46634e = editProfileImageViewModel;
            this.f46635f = str;
            this.f46636g = hVar;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            d dVar2 = new d(this.f46632c, this.f46633d, this.f46634e, this.f46635f, this.f46636g, dVar);
            dVar2.f46631b = obj;
            return dVar2;
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((d) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:48:0x016e, code lost:
        
            if (com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel.x4(r5, r20) == r1) goto L49;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v1, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v10 */
        /* JADX WARN: Type inference failed for: r7v17, types: [java.util.List] */
        /* JADX WARN: Type inference failed for: r7v7, types: [java.util.ArrayList] */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            File file;
            Bitmap bitmapC;
            ?? arrayList;
            Object objJ;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46630a;
            EditProfileImageViewModel editProfileImageViewModel = this.f46634e;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                    objJ = obj;
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            Uri uri = this.f46632c;
            if (uri != null) {
                try {
                    file = new File(new URI(uri.toString()));
                } catch (Exception unused) {
                    file = null;
                }
                Context context = this.f46633d;
                if (file == null || !file.exists()) {
                    zp0.c.f206560v.getClass();
                    zp0.c cVarA = zp0.c.a.a(context);
                    cVarA.f206568h = uri;
                    bitmapC = cVarA.c();
                } else {
                    zp0.c.f206560v.getClass();
                    zp0.c cVarA2 = zp0.c.a.a(context);
                    cVarA2.f206569i = file;
                    bitmapC = cVarA2.c();
                }
                if (bitmapC == null) {
                    Exception exc = new Exception(am.j.j(uri, "Failed to load bitmap from uri: "));
                    String[] strArr = EditProfileImageViewModel.M0;
                    editProfileImageViewModel.G4(exc);
                    return Unit.INSTANCE;
                }
                List listK = x.k(c22.q.b(bitmapC, 298, 298), c22.q.b(bitmapC, 120, 120), c22.q.b(bitmapC, 60, 60));
                arrayList = new ArrayList(y.r(listK, 10));
                int i15 = 0;
                for (Object obj2 : listK) {
                    int i16 = i15 + 1;
                    if (i15 < 0) {
                        x.q();
                        throw null;
                    }
                    zp0.f fVar = (zp0.f) obj2;
                    MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
                    String str = EditProfileImageViewModel.M0[i15];
                    arrayList.add(companion.createFormData(str, e5.g(str, ".", fVar.f206589b), RequestBody.Companion.create$default(RequestBody.INSTANCE, fVar.f206588a, gz0.a.f80404d, 0, 0, 6, (Object) null)));
                    i15 = i16;
                }
            } else {
                MultipartBody.Part.Companion companion2 = MultipartBody.Part.INSTANCE;
                arrayList = x.k(companion2.createFormData("", ""), companion2.createFormData("", ""), companion2.createFormData("", ""));
            }
            ?? r14 = arrayList;
            String[] strArr2 = EditProfileImageViewModel.M0;
            String str2 = editProfileImageViewModel.D4() ? this.f46635f : "NO_FRAME";
            String str3 = "updateProfileWithPhoto, imageType: " + this.f46636g + ", frameKey: " + str2;
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.b(a2Var, "EditProfileImageViewModel", str3);
            j jVar = editProfileImageViewModel.f46599d;
            String str4 = (String) editProfileImageViewModel.B.getValue();
            this.f46631b = null;
            this.f46630a = 1;
            jVar.getClass();
            objJ = f0.J(jVar, new k(jVar, str4, r14, this.f46636g, str2, null), this);
            if (objJ != aVar) {
            }
            return aVar;
            v2 v2Var = (v2) objJ;
            if (v2Var instanceof v2.a) {
                Exception exc2 = ((v2.a) v2Var).f47383a;
                String[] strArr3 = EditProfileImageViewModel.M0;
                editProfileImageViewModel.G4(exc2);
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                this.f46631b = null;
                this.f46630a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel$updateProfileWithoutPhoto$1", f = "EditProfileImageViewModel.kt", l = {486, 494}, m = "invokeSuspend", v = 2)
    public static final class e extends i implements e23.p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46637a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ com.garmin.android.apps.connectmobile.userprofile.model.h f46639c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f46640d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f46641e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(com.garmin.android.apps.connectmobile.userprofile.model.h hVar, String str, String str2, t13.d<? super e> dVar) {
            super(2, dVar);
            this.f46639c = hVar;
            this.f46640d = str;
            this.f46641e = str2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return EditProfileImageViewModel.this.new e(this.f46639c, this.f46640d, this.f46641e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
        
            if (com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel.x4(r5, r13) == r0) goto L25;
         */
        @Override // v13.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46637a;
            EditProfileImageViewModel editProfileImageViewModel = EditProfileImageViewModel.this;
            if (i14 != 0) {
                if (i14 == 1) {
                    r.b(obj);
                } else {
                    if (i14 != 2) {
                        vb.h.z("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    r.b(obj);
                }
                return Unit.INSTANCE;
            }
            r.b(obj);
            j jVar = editProfileImageViewModel.f46599d;
            String str = (String) editProfileImageViewModel.B.getValue();
            String str2 = editProfileImageViewModel.D4() ? this.f46640d : "NO_FRAME";
            this.f46637a = 1;
            jVar.getClass();
            obj = f0.J(jVar, new a22.l(jVar, str, this.f46639c, str2, this.f46641e, null), this);
            if (obj != aVar) {
            }
            return aVar;
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                Exception exc = ((v2.a) v2Var).f47383a;
                String[] strArr = EditProfileImageViewModel.M0;
                editProfileImageViewModel.G4(exc);
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                this.f46637a = 2;
            }
            return Unit.INSTANCE;
        }
    }

    static {
        new a(null);
        M0 = new String[]{"profileFile", "friendsFile", "thumbnailFile"};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public EditProfileImageViewModel() {
        qo1.c.f145960d.getClass();
        this.f46597b = qo1.c.a.a();
        a22.a.f525b.getClass();
        ez0.b bVar = ez0.b.f67468a;
        this.f46598c = new a22.a((a22.d) ez0.b.a(bVar, ez0.c.GC_WEB_URL, a22.d.class, new c83.h.a[0], null, null, null, 120));
        j.a aVar = j.f560b;
        a22.e eVar = (a22.e) ez0.b.a(bVar, ez0.c.GC, a22.e.class, new c83.h.a[0], null, null, null, 120);
        aVar.getClass();
        eVar.getClass();
        this.f46599d = new j(eVar);
        v0.T.getClass();
        this.f46600e = v0.a.b().b();
        m0 m0Var = new m0(null, 1, 0 == true ? 1 : 0);
        this.f46601f = m0Var;
        y0<p> y0Var = new y0<>();
        this.f46602g = y0Var;
        this.f46603h = y0Var;
        y0<f> y0Var2 = new y0<>();
        this.f46604i = y0Var2;
        this.f46605j = y0Var2;
        y0<com.garmin.android.apps.connectmobile.userprofile.model.e> y0Var3 = new y0<>();
        this.f46606k = y0Var3;
        this.f46608l = y0Var3;
        Boolean bool = Boolean.FALSE;
        this.f46609m = new y0<>(bool);
        y0<Boolean> y0Var4 = new y0<>(bool);
        this.f46610n = y0Var4;
        this.f46611o = y0Var4;
        y0<Unit> y0Var5 = new y0<>();
        this.f46612p = y0Var5;
        this.f46613q = y0Var5;
        y0<Unit> y0Var6 = new y0<>();
        this.f46614r = y0Var6;
        this.f46615t = y0Var6;
        y0<Exception> y0Var7 = new y0<>();
        this.f46616v = y0Var7;
        this.f46617w = y0Var7;
        y0<List<com.garmin.android.apps.connectmobile.userprofile.model.a>> y0Var8 = new y0<>();
        this.f46618x = y0Var8;
        this.f46619y = y0Var8;
        y0<String> y0Var9 = new y0<>();
        this.f46620z = y0Var9;
        this.A = y0Var9;
        this.B = m.b(new d0(12));
        y0<Boolean> y0Var10 = new y0<>(bool);
        this.C = y0Var10;
        this.D = y0Var10;
        y0<Boolean> y0Var11 = new y0<>(bool);
        this.E = y0Var11;
        this.F = y0Var11;
        final w0 w0Var = new w0();
        final int i14 = 0;
        w0Var.n(y0Var11, new b(new l() { // from class: n12.j0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i15 = i14;
                boolean z14 = true;
                EditProfileImageViewModel editProfileImageViewModel = this;
                androidx.lifecycle.w0 w0Var2 = w0Var;
                switch (i15) {
                    case 0:
                        String[] strArr = EditProfileImageViewModel.M0;
                        w0Var2.m(Boolean.valueOf((((Boolean) obj).booleanValue() || editProfileImageViewModel.f46608l.d() == 0) ? false : true));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.e) obj;
                        String[] strArr2 = EditProfileImageViewModel.M0;
                        w0Var2.m(Boolean.valueOf((editProfileImageViewModel.D4() || eVar2 == null) ? false : true));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        List<com.garmin.android.apps.connectmobile.userprofile.model.e> listD = editProfileImageViewModel.P.d();
                        if (listD == null) {
                            listD = p13.j0.f134944a;
                        }
                        w0Var2.m(new o13.p(listD, bool2));
                        break;
                    case 3:
                        String[] strArr3 = EditProfileImageViewModel.M0;
                        w0Var2.m(new o13.p((List) obj, Boolean.valueOf(editProfileImageViewModel.D4())));
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) obj;
                        Boolean boolD = editProfileImageViewModel.X.d();
                        if (!(boolD != null ? boolD.booleanValue() : false) || (!(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var2.m(Boolean.valueOf(z14));
                        break;
                    default:
                        Boolean bool3 = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar2 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) editProfileImageViewModel.f46605j.d();
                        if (!(bool3 != null ? bool3.booleanValue() : false) || (!(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var2.m(Boolean.valueOf(z14));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i15 = 1;
        w0Var.n(y0Var3, new b(new l() { // from class: n12.j0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i16 = i15;
                boolean z14 = true;
                EditProfileImageViewModel editProfileImageViewModel = this;
                androidx.lifecycle.w0 w0Var2 = w0Var;
                switch (i16) {
                    case 0:
                        String[] strArr = EditProfileImageViewModel.M0;
                        w0Var2.m(Boolean.valueOf((((Boolean) obj).booleanValue() || editProfileImageViewModel.f46608l.d() == 0) ? false : true));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.e) obj;
                        String[] strArr2 = EditProfileImageViewModel.M0;
                        w0Var2.m(Boolean.valueOf((editProfileImageViewModel.D4() || eVar2 == null) ? false : true));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        List<com.garmin.android.apps.connectmobile.userprofile.model.e> listD = editProfileImageViewModel.P.d();
                        if (listD == null) {
                            listD = p13.j0.f134944a;
                        }
                        w0Var2.m(new o13.p(listD, bool2));
                        break;
                    case 3:
                        String[] strArr3 = EditProfileImageViewModel.M0;
                        w0Var2.m(new o13.p((List) obj, Boolean.valueOf(editProfileImageViewModel.D4())));
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) obj;
                        Boolean boolD = editProfileImageViewModel.X.d();
                        if (!(boolD != null ? boolD.booleanValue() : false) || (!(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var2.m(Boolean.valueOf(z14));
                        break;
                    default:
                        Boolean bool3 = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar2 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) editProfileImageViewModel.f46605j.d();
                        if (!(bool3 != null ? bool3.booleanValue() : false) || (!(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var2.m(Boolean.valueOf(z14));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        this.I = w0Var;
        y0<List<com.garmin.android.apps.connectmobile.userprofile.model.e>> y0Var12 = new y0<>();
        this.P = y0Var12;
        final w0 w0Var2 = new w0();
        final int i16 = 2;
        w0Var2.n(y0Var11, new b(new l() { // from class: n12.j0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i17 = i16;
                boolean z14 = true;
                EditProfileImageViewModel editProfileImageViewModel = this;
                androidx.lifecycle.w0 w0Var3 = w0Var2;
                switch (i17) {
                    case 0:
                        String[] strArr = EditProfileImageViewModel.M0;
                        w0Var3.m(Boolean.valueOf((((Boolean) obj).booleanValue() || editProfileImageViewModel.f46608l.d() == 0) ? false : true));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.e) obj;
                        String[] strArr2 = EditProfileImageViewModel.M0;
                        w0Var3.m(Boolean.valueOf((editProfileImageViewModel.D4() || eVar2 == null) ? false : true));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        List<com.garmin.android.apps.connectmobile.userprofile.model.e> listD = editProfileImageViewModel.P.d();
                        if (listD == null) {
                            listD = p13.j0.f134944a;
                        }
                        w0Var3.m(new o13.p(listD, bool2));
                        break;
                    case 3:
                        String[] strArr3 = EditProfileImageViewModel.M0;
                        w0Var3.m(new o13.p((List) obj, Boolean.valueOf(editProfileImageViewModel.D4())));
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) obj;
                        Boolean boolD = editProfileImageViewModel.X.d();
                        if (!(boolD != null ? boolD.booleanValue() : false) || (!(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var3.m(Boolean.valueOf(z14));
                        break;
                    default:
                        Boolean bool3 = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar2 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) editProfileImageViewModel.f46605j.d();
                        if (!(bool3 != null ? bool3.booleanValue() : false) || (!(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var3.m(Boolean.valueOf(z14));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i17 = 3;
        w0Var2.n(y0Var12, new b(new l() { // from class: n12.j0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i18 = i17;
                boolean z14 = true;
                EditProfileImageViewModel editProfileImageViewModel = this;
                androidx.lifecycle.w0 w0Var3 = w0Var2;
                switch (i18) {
                    case 0:
                        String[] strArr = EditProfileImageViewModel.M0;
                        w0Var3.m(Boolean.valueOf((((Boolean) obj).booleanValue() || editProfileImageViewModel.f46608l.d() == 0) ? false : true));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.e) obj;
                        String[] strArr2 = EditProfileImageViewModel.M0;
                        w0Var3.m(Boolean.valueOf((editProfileImageViewModel.D4() || eVar2 == null) ? false : true));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        List<com.garmin.android.apps.connectmobile.userprofile.model.e> listD = editProfileImageViewModel.P.d();
                        if (listD == null) {
                            listD = p13.j0.f134944a;
                        }
                        w0Var3.m(new o13.p(listD, bool2));
                        break;
                    case 3:
                        String[] strArr3 = EditProfileImageViewModel.M0;
                        w0Var3.m(new o13.p((List) obj, Boolean.valueOf(editProfileImageViewModel.D4())));
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) obj;
                        Boolean boolD = editProfileImageViewModel.X.d();
                        if (!(boolD != null ? boolD.booleanValue() : false) || (!(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var3.m(Boolean.valueOf(z14));
                        break;
                    default:
                        Boolean bool3 = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar2 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) editProfileImageViewModel.f46605j.d();
                        if (!(bool3 != null ? bool3.booleanValue() : false) || (!(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var3.m(Boolean.valueOf(z14));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        this.T = w0Var2;
        y0<Boolean> y0Var13 = new y0<>(Boolean.valueOf(!m0Var.f122267a.W2("keyShowTipView", false)));
        this.X = y0Var13;
        final w0 w0Var3 = new w0();
        final int i18 = 4;
        w0Var3.n(y0Var2, new b(new l() { // from class: n12.j0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i19 = i18;
                boolean z14 = true;
                EditProfileImageViewModel editProfileImageViewModel = this;
                androidx.lifecycle.w0 w0Var4 = w0Var3;
                switch (i19) {
                    case 0:
                        String[] strArr = EditProfileImageViewModel.M0;
                        w0Var4.m(Boolean.valueOf((((Boolean) obj).booleanValue() || editProfileImageViewModel.f46608l.d() == 0) ? false : true));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.e) obj;
                        String[] strArr2 = EditProfileImageViewModel.M0;
                        w0Var4.m(Boolean.valueOf((editProfileImageViewModel.D4() || eVar2 == null) ? false : true));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        List<com.garmin.android.apps.connectmobile.userprofile.model.e> listD = editProfileImageViewModel.P.d();
                        if (listD == null) {
                            listD = p13.j0.f134944a;
                        }
                        w0Var4.m(new o13.p(listD, bool2));
                        break;
                    case 3:
                        String[] strArr3 = EditProfileImageViewModel.M0;
                        w0Var4.m(new o13.p((List) obj, Boolean.valueOf(editProfileImageViewModel.D4())));
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) obj;
                        Boolean boolD = editProfileImageViewModel.X.d();
                        if (!(boolD != null ? boolD.booleanValue() : false) || (!(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var4.m(Boolean.valueOf(z14));
                        break;
                    default:
                        Boolean bool3 = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar2 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) editProfileImageViewModel.f46605j.d();
                        if (!(bool3 != null ? bool3.booleanValue() : false) || (!(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var4.m(Boolean.valueOf(z14));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        final int i19 = 5;
        w0Var3.n(y0Var13, new b(new l() { // from class: n12.j0
            /* JADX WARN: Multi-variable type inference failed */
            @Override // e23.l
            public final Object invoke(Object obj) {
                int i110 = i19;
                boolean z14 = true;
                EditProfileImageViewModel editProfileImageViewModel = this;
                androidx.lifecycle.w0 w0Var4 = w0Var3;
                switch (i110) {
                    case 0:
                        String[] strArr = EditProfileImageViewModel.M0;
                        w0Var4.m(Boolean.valueOf((((Boolean) obj).booleanValue() || editProfileImageViewModel.f46608l.d() == 0) ? false : true));
                        break;
                    case 1:
                        com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.e) obj;
                        String[] strArr2 = EditProfileImageViewModel.M0;
                        w0Var4.m(Boolean.valueOf((editProfileImageViewModel.D4() || eVar2 == null) ? false : true));
                        break;
                    case 2:
                        Boolean bool2 = (Boolean) obj;
                        List<com.garmin.android.apps.connectmobile.userprofile.model.e> listD = editProfileImageViewModel.P.d();
                        if (listD == null) {
                            listD = p13.j0.f134944a;
                        }
                        w0Var4.m(new o13.p(listD, bool2));
                        break;
                    case 3:
                        String[] strArr3 = EditProfileImageViewModel.M0;
                        w0Var4.m(new o13.p((List) obj, Boolean.valueOf(editProfileImageViewModel.D4())));
                        break;
                    case 4:
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) obj;
                        Boolean boolD = editProfileImageViewModel.X.d();
                        if (!(boolD != null ? boolD.booleanValue() : false) || (!(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var4.m(Boolean.valueOf(z14));
                        break;
                    default:
                        Boolean bool3 = (Boolean) obj;
                        com.garmin.android.apps.connectmobile.userprofile.editimage.f fVar2 = (com.garmin.android.apps.connectmobile.userprofile.editimage.f) editProfileImageViewModel.f46605j.d();
                        if (!(bool3 != null ? bool3.booleanValue() : false) || (!(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.d) && !(fVar2 instanceof com.garmin.android.apps.connectmobile.userprofile.editimage.f.c))) {
                            z14 = false;
                        }
                        w0Var4.m(Boolean.valueOf(z14));
                        break;
                }
                return Unit.INSTANCE;
            }
        }));
        this.Y = w0Var3;
        y0<Uri> y0Var14 = new y0<>();
        this.Z = y0Var14;
        this.f46607k0 = y0Var14;
        y0<Boolean> y0Var15 = new y0<>();
        this.H0 = y0Var15;
        this.I0 = y0Var15;
    }

    public static /* synthetic */ void J4(EditProfileImageViewModel editProfileImageViewModel, com.garmin.android.apps.connectmobile.userprofile.model.h hVar, String str, String str2, int i14) {
        if ((i14 & 2) != 0) {
            str = null;
        }
        if ((i14 & 4) != 0) {
            str2 = null;
        }
        editProfileImageViewModel.I4(hVar, str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object x4(EditProfileImageViewModel editProfileImageViewModel, v13.c cVar) throws Throwable {
        k0 k0Var;
        int i14;
        editProfileImageViewModel.getClass();
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i15 = k0Var.f122254d;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                k0Var.f122254d = i15 - Integer.MIN_VALUE;
            } else {
                k0Var = new k0(editProfileImageViewModel, cVar);
            }
        } else {
            k0Var = new k0(editProfileImageViewModel, cVar);
        }
        Object obj = k0Var.f122252b;
        u13.a aVar = u13.a.COROUTINE_SUSPENDED;
        int i16 = k0Var.f122254d;
        if (i16 == 0) {
            r.b(obj);
            int userProfilePk = ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).getUserProfilePk();
            x53.c cVar2 = s0.f129406a;
            x53.b bVar = x53.b.f189152a;
            l0 l0Var = new l0(userProfilePk, null);
            k0Var.f122251a = userProfilePk;
            k0Var.f122254d = 1;
            Object objE0 = ge1.b.e0(bVar, l0Var, k0Var);
            if (objE0 == aVar) {
                return aVar;
            }
            i14 = userProfilePk;
            obj = objE0;
        } else {
            if (i16 != 1) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i14 = k0Var.f122251a;
            r.b(obj);
        }
        com.garmin.android.apps.connectmobile.userprofile.model.l lVar = (com.garmin.android.apps.connectmobile.userprofile.model.l) q6.f.l(i14, (Map) obj);
        ((oo1.a) KoinJavaComponent.get$default(oo1.a.class, null, null, 6, null)).a(lVar != null ? lVar.getProfileImageUrls() : null);
        editProfileImageViewModel.J0 = null;
        File file = editProfileImageViewModel.K0;
        if (file != null) {
            file.delete();
        }
        editProfileImageViewModel.f46610n.j(Boolean.FALSE);
        y0<Unit> y0Var = editProfileImageViewModel.f46614r;
        Unit unit = Unit.INSTANCE;
        y0Var.j(unit);
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A4() {
        Uri uri;
        String strG;
        f fVar = (f) this.f46605j.d();
        Uri f46701a = fVar != null ? fVar.getF46701a() : null;
        p pVar = (p) this.f46603h.d();
        if (pVar == null || (strG = pVar.g()) == null || (uri = Uri.parse(strG)) == null) {
            uri = Uri.EMPTY;
        }
        return !s.g(f46701a, uri);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean B4() {
        com.garmin.android.apps.connectmobile.userprofile.model.e eVar = (com.garmin.android.apps.connectmobile.userprofile.model.e) this.f46608l.d();
        Integer numValueOf = eVar != null ? Integer.valueOf(eVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) : null;
        com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = this.f46596a;
        return !s.g(numValueOf, eVar2 != null ? Integer.valueOf(eVar2.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String()) : null);
    }

    public final boolean C4() {
        return this.f46608l.d() == 0;
    }

    public final boolean D4() {
        return s.g(this.F.d(), Boolean.TRUE);
    }

    public final boolean E4() {
        y0 y0Var = this.f46605j;
        return (y0Var.d() instanceof f.d) || (y0Var.d() instanceof f.c);
    }

    public final void F4() {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new c(null), 2);
    }

    public final void G4(Exception exc) {
        String strM = am.j.m("Upload Profile Pic -> failed with error=[", exc.getMessage(), "]");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.f(a2Var, "EditProfileImageViewModel", strM);
        this.f46616v.j(new UploadFailedException(exc.getMessage()));
        this.f46610n.j(Boolean.FALSE);
    }

    public final void H4(Context context, Uri uri, com.garmin.android.apps.connectmobile.userprofile.model.h hVar, String str) {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new d(uri, context, this, str, hVar, null), 2);
    }

    public final void I4(com.garmin.android.apps.connectmobile.userprofile.model.h hVar, String str, String str2) {
        w9.a aVarA = v1.a(this);
        x53.c cVar = s0.f129406a;
        ge1.b.T(aVarA, x53.b.f189152a, null, new e(hVar, str, str2, null), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean y4() {
        p pVar = (p) this.f46603h.d();
        return (pVar != null ? pVar.getProfileImageType() : null) == com.garmin.android.apps.connectmobile.userprofile.model.h.DEFAULT_AVATAR && s.g(this.f46605j.d(), f.b.f46704b);
    }

    public final boolean z4() {
        if (!A4()) {
            Boolean boolD = this.f46609m.d();
            if (!(boolD != null ? boolD.booleanValue() : true)) {
                return false;
            }
        }
        return true;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0014\u0010\f\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\nR\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/garmin/android/apps/connectmobile/userprofile/editimage/EditProfileImageViewModel$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "GCM_TEMP_FILE", "", "PROFILE_IMAGE_SIZE", "I", "FRIENDS_IMAGE_SIZE", "THUMBNAIL_IMAGE_SIZE", "NO_FRAME_KEY", "", "NAMES", "[Ljava/lang/String;", "gcm-profile_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
