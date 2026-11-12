package com.garmin.android.apps.connectmobile.userprofile.editimage;

import android.net.Uri;
import androidx.lifecycle.y0;
import ch.qos.logback.core.net.SyslogConstants;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.f0;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.userprofile.model.h;
import com.garmin.android.apps.connectmobile.v2;
import com.google.mlkit.common.MlKitException;
import e23.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import lc.u0;
import m12.k;
import o13.r;
import o53.b0;
import o53.j0;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p13.h0;
import p13.x;
import p13.y;
import v13.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
@v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel$updateProfileData$2", f = "EditProfileImageViewModel.kt", l = {MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, 208}, m = "invokeSuspend", v = 2)
public final class e extends i implements p<b0, t13.d<? super Unit>, Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List f46684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public List f46685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public List f46686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f46687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public /* synthetic */ Object f46688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f46689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ EditProfileImageViewModel f46690g;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46691a;

        static {
            int[] iArr = new int[h.values().length];
            try {
                iArr[h.UPLOADED_PHOTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[h.THEMED_AVATAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[h.DEFAULT_AVATAR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f46691a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel$updateProfileData$2$avatarJob$1", f = "EditProfileImageViewModel.kt", l = {171}, m = "invokeSuspend", v = 2)
    public static final class b extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public ArrayList f46692a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f46693b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ EditProfileImageViewModel f46694c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<String> f46695d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.a> f46696e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(EditProfileImageViewModel editProfileImageViewModel, List<String> list, List<com.garmin.android.apps.connectmobile.userprofile.model.a> list2, t13.d<? super b> dVar) {
            super(2, dVar);
            this.f46694c = editProfileImageViewModel;
            this.f46695d = list;
            this.f46696e = list2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new b(this.f46694c, this.f46695d, this.f46696e, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((b) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46693b;
            EditProfileImageViewModel editProfileImageViewModel = this.f46694c;
            if (i14 == 0) {
                ArrayList arrayListX = v.h.x(obj);
                k kVar = new k(null, 1, null);
                String str = editProfileImageViewModel.f46600e;
                this.f46692a = arrayListX;
                this.f46693b = 1;
                Object objB = kVar.b(str, this);
                if (objB == aVar) {
                    return aVar;
                }
                arrayList = arrayListX;
                obj = objB;
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                arrayList = this.f46692a;
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            if (v2Var instanceof v2.a) {
                String str2 = ((v2.a) v2Var).f47385c;
                if (str2 == null) {
                    str2 = "Failed to fetch avatars";
                }
                this.f46695d.add(str2);
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                arrayList.addAll((Collection) ((v2.b) v2Var).f47386a);
            }
            List<com.garmin.android.apps.connectmobile.userprofile.model.a> list = this.f46696e;
            list.addAll(arrayList);
            editProfileImageViewModel.f46618x.j(list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel$updateProfileData$2$frameJob$1", f = "EditProfileImageViewModel.kt", l = {SyslogConstants.LOG_LOCAL7}, m = "invokeSuspend", v = 2)
    public static final class c extends i implements p<b0, t13.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f46697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ EditProfileImageViewModel f46698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ List<String> f46699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ List<com.garmin.android.apps.connectmobile.userprofile.model.e> f46700d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(EditProfileImageViewModel editProfileImageViewModel, List<String> list, List<com.garmin.android.apps.connectmobile.userprofile.model.e> list2, t13.d<? super c> dVar) {
            super(2, dVar);
            this.f46698b = editProfileImageViewModel;
            this.f46699c = list;
            this.f46700d = list2;
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new c(this.f46698b, this.f46699c, this.f46700d, dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return ((c) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            int i14 = this.f46697a;
            EditProfileImageViewModel editProfileImageViewModel = this.f46698b;
            if (i14 == 0) {
                r.b(obj);
                a22.a aVar2 = editProfileImageViewModel.f46598c;
                this.f46697a = 1;
                aVar2.getClass();
                obj = f0.J(aVar2, new a22.c(aVar2, null), this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i14 != 1) {
                    vb.h.z("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                r.b(obj);
            }
            v2 v2Var = (v2) obj;
            boolean z14 = v2Var instanceof v2.a;
            List<com.garmin.android.apps.connectmobile.userprofile.model.e> list = this.f46700d;
            List<String> list2 = this.f46699c;
            if (z14) {
                list2.add("Failed to fetch frame");
            } else {
                if (!(v2Var instanceof v2.b)) {
                    u0.r();
                    return null;
                }
                com.garmin.android.apps.connectmobile.userprofile.model.f fVar = (com.garmin.android.apps.connectmobile.userprofile.model.f) ((v2.b) v2Var).f47386a;
                String baseUrl = fVar.getBaseUrl();
                List<com.garmin.android.apps.connectmobile.userprofile.model.e> listD = fVar.d();
                if (baseUrl == null || listD == null) {
                    list2.add("Failed to fetch frame");
                } else {
                    for (com.garmin.android.apps.connectmobile.userprofile.model.e eVar : listD) {
                        eVar.h(editProfileImageViewModel.f46600e + baseUrl + eVar.getImage());
                        eVar.i(editProfileImageViewModel.f46600e + baseUrl + eVar.getPreviewImageMobile());
                    }
                    list.addAll(listD);
                }
            }
            editProfileImageViewModel.P.j(list);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo53/b0;", "", "<anonymous>", "(Lo53/b0;)V"}, k = 3, mv = {2, 3, 0})
    @v13.e(c = "com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageViewModel$updateProfileData$2$frameJob$2", f = "EditProfileImageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends i implements p<b0, t13.d<? super Unit>, Object> {
        public d(t13.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // v13.a
        public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
            return new d(dVar);
        }

        @Override // e23.p
        public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
            return new d(dVar).invokeSuspend(Unit.INSTANCE);
        }

        @Override // v13.a
        public final Object invokeSuspend(Object obj) {
            u13.a aVar = u13.a.COROUTINE_SUSPENDED;
            r.b(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(boolean z14, EditProfileImageViewModel editProfileImageViewModel, t13.d<? super e> dVar) {
        super(2, dVar);
        this.f46689f = z14;
        this.f46690g = editProfileImageViewModel;
    }

    @Override // v13.a
    public final t13.d<Unit> create(Object obj, t13.d<?> dVar) {
        e eVar = new e(this.f46689f, this.f46690g, dVar);
        eVar.f46688e = obj;
        return eVar;
    }

    @Override // e23.p
    public final Object invoke(b0 b0Var, t13.d<? super Unit> dVar) {
        return ((e) create(b0Var, dVar)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:25:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:29:0x00db  */
    /* JADX WARN: Code duplicated, block: B:31:0x00df A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:41:0x0106  */
    /* JADX WARN: Code duplicated, block: B:42:0x011b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x0148  */
    /* JADX WARN: Code duplicated, block: B:52:0x015c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0179  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2 A[LOOP:0: B:64:0x01b4->B:68:0x01c2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:74:0x020c  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x018f A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:24:0x00a5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // v13.a
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        List list;
        List list2;
        Object objJ;
        List list3;
        v2 v2Var;
        com.garmin.android.apps.connectmobile.userprofile.model.p pVar;
        y0<f> y0Var;
        int i14;
        Iterator it;
        Object next;
        String str;
        Iterator it3;
        Object next2;
        com.garmin.android.apps.connectmobile.userprofile.model.a aVar;
        String uuid;
        ArrayList arrayList2;
        int i15;
        b0 b0Var = (b0) this.f46688e;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i16 = this.f46687d;
        int i17 = 0;
        EditProfileImageViewModel editProfileImageViewModel = this.f46690g;
        if (i16 == 0) {
            ArrayList arrayListX = v.h.x(obj);
            arrayList = new ArrayList();
            j0 j0VarJ = ge1.b.j(b0Var, null, null, new b(editProfileImageViewModel, arrayListX, arrayList, null), 3);
            ArrayList arrayList3 = new ArrayList();
            List listK = x.k(j0VarJ, this.f46689f ? ge1.b.j(b0Var, null, null, new c(editProfileImageViewModel, arrayListX, arrayList3, null), 3) : ge1.b.j(b0Var, null, null, new d(null), 3));
            this.f46688e = b0Var;
            this.f46684a = arrayListX;
            this.f46685b = arrayList;
            this.f46686c = arrayList3;
            this.f46687d = 1;
            if (g8.i.Q(listK, this) != aVar2) {
                list = arrayListX;
                list2 = arrayList3;
            }
            return aVar2;
        }
        if (i16 == 1) {
            list2 = this.f46686c;
            arrayList = this.f46685b;
            list = this.f46684a;
            r.b(obj);
        } else {
            if (i16 != 2) {
                vb.h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            List list4 = this.f46686c;
            list3 = this.f46685b;
            List list5 = this.f46684a;
            r.b(obj);
            list = list5;
            list2 = list4;
            objJ = obj;
        }
        v2Var = (v2) objJ;
        if (v2Var instanceof v2.a) {
            list.add("Failed to fetch profile, error message: " + ((v2.a) v2Var).f47383a);
        } else {
            if (v2Var instanceof v2.b) {
                u0.r();
                return null;
            }
            pVar = (com.garmin.android.apps.connectmobile.userprofile.model.p) ((v2.b) v2Var).f47386a;
            y0<com.garmin.android.apps.connectmobile.userprofile.model.p> y0Var2 = editProfileImageViewModel.f46602g;
            y0Var = editProfileImageViewModel.f46604i;
            y0Var2.j(pVar);
            i14 = a.f46691a[pVar.getProfileImageType().ordinal()];
            if (i14 != 1) {
                str = "";
                if (i14 != 2) {
                    Uri uri = Uri.parse(pVar.g());
                    uri.getClass();
                    y0Var.j(new f.e(uri, ""));
                } else if (i14 != 3) {
                    it3 = list3.iterator();
                    do {
                        if (it3.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it3.next();
                    } while (!s.g(((com.garmin.android.apps.connectmobile.userprofile.model.a) next2).getUuid(), pVar.getImageUuid()));
                    aVar = (com.garmin.android.apps.connectmobile.userprofile.model.a) next2;
                    if (aVar == null) {
                        String strN = fb1.c.n("Can not find selected avatar. Current avatar uuid: ", pVar.getImageUuid());
                        i2.a aVar3 = i2.f36769a;
                        a2 a2Var = a2.GENERAL;
                        aVar3.getClass();
                        i2.a.f(a2Var, "EditProfileImageViewModel", strN);
                    } else {
                        editProfileImageViewModel.f46620z.j(pVar.getImageUuid());
                    }
                    Uri uri2 = Uri.parse(pVar.g());
                    uri2.getClass();
                    if (aVar != null && (uuid = aVar.getUuid()) != null) {
                        str = uuid;
                    }
                    y0Var.j(new f.a(uri2, str));
                } else {
                    y0Var.j(f.b.f46704b);
                }
            } else {
                Uri uri3 = Uri.parse(pVar.g());
                uri3.getClass();
                y0Var.j(new f.d(uri3));
            }
            it = list2.iterator();
            do {
                if (it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(((com.garmin.android.apps.connectmobile.userprofile.model.e) next).getUuid(), pVar.getProfileFrameKey()));
            com.garmin.android.apps.connectmobile.userprofile.model.e eVar = (com.garmin.android.apps.connectmobile.userprofile.model.e) next;
            editProfileImageViewModel.f46596a = eVar;
            editProfileImageViewModel.f46606k.j(eVar);
        }
        editProfileImageViewModel.L0 = list.isEmpty();
        if (!list.isEmpty()) {
            arrayList2 = new ArrayList(y.r(list, 10));
            for (Object obj2 : list) {
                i15 = i17 + 1;
                if (i17 >= 0) {
                    x.q();
                    throw null;
                }
                arrayList2.add(o2.c.e(i17, "[", "]: ", (String) obj2, "\n"));
                i17 = i15;
            }
            String strK0 = h0.k0(arrayList2, null, null, null, null, 63);
            i2.a aVar4 = i2.f36769a;
            a2 a2Var2 = a2.GENERAL;
            aVar4.getClass();
            i2.a.f(a2Var2, "EditProfileImageViewModel", strK0);
            editProfileImageViewModel.f46616v.j(new Exception(strK0));
        }
        editProfileImageViewModel.H0.j(Boolean.valueOf(editProfileImageViewModel.L0));
        editProfileImageViewModel.f46610n.j(Boolean.FALSE);
        return Unit.INSTANCE;
        qo1.c cVar = editProfileImageViewModel.f46597b;
        this.f46688e = b0Var;
        this.f46684a = list;
        this.f46685b = arrayList;
        this.f46686c = list2;
        this.f46687d = 2;
        cVar.getClass();
        objJ = f0.J(cVar, new qo1.d(cVar, null), this);
        if (objJ != aVar2) {
            list3 = arrayList;
            v2Var = (v2) objJ;
            if (v2Var instanceof v2.a) {
                list.add("Failed to fetch profile, error message: " + ((v2.a) v2Var).f47383a);
            } else {
                if (v2Var instanceof v2.b) {
                    u0.r();
                    return null;
                }
                pVar = (com.garmin.android.apps.connectmobile.userprofile.model.p) ((v2.b) v2Var).f47386a;
                y0<com.garmin.android.apps.connectmobile.userprofile.model.p> y0Var3 = editProfileImageViewModel.f46602g;
                y0Var = editProfileImageViewModel.f46604i;
                y0Var3.j(pVar);
                i14 = a.f46691a[pVar.getProfileImageType().ordinal()];
                if (i14 != 1) {
                    str = "";
                    if (i14 != 2) {
                        Uri uri4 = Uri.parse(pVar.g());
                        uri4.getClass();
                        y0Var.j(new f.e(uri4, ""));
                    } else if (i14 != 3) {
                        it3 = list3.iterator();
                        do {
                            if (it3.hasNext()) {
                                next2 = null;
                                break;
                            }
                            next2 = it3.next();
                        } while (!s.g(((com.garmin.android.apps.connectmobile.userprofile.model.a) next2).getUuid(), pVar.getImageUuid()));
                        aVar = (com.garmin.android.apps.connectmobile.userprofile.model.a) next2;
                        if (aVar == null) {
                            String strN2 = fb1.c.n("Can not find selected avatar. Current avatar uuid: ", pVar.getImageUuid());
                            i2.a aVar5 = i2.f36769a;
                            a2 a2Var3 = a2.GENERAL;
                            aVar5.getClass();
                            i2.a.f(a2Var3, "EditProfileImageViewModel", strN2);
                        } else {
                            editProfileImageViewModel.f46620z.j(pVar.getImageUuid());
                        }
                        Uri uri5 = Uri.parse(pVar.g());
                        uri5.getClass();
                        if (aVar != null) {
                            str = uuid;
                        }
                        y0Var.j(new f.a(uri5, str));
                    } else {
                        y0Var.j(f.b.f46704b);
                    }
                } else {
                    Uri uri6 = Uri.parse(pVar.g());
                    uri6.getClass();
                    y0Var.j(new f.d(uri6));
                }
                it = list2.iterator();
                do {
                    if (it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!s.g(((com.garmin.android.apps.connectmobile.userprofile.model.e) next).getUuid(), pVar.getProfileFrameKey()));
                com.garmin.android.apps.connectmobile.userprofile.model.e eVar2 = (com.garmin.android.apps.connectmobile.userprofile.model.e) next;
                editProfileImageViewModel.f46596a = eVar2;
                editProfileImageViewModel.f46606k.j(eVar2);
            }
            editProfileImageViewModel.L0 = list.isEmpty();
            if (!list.isEmpty()) {
                arrayList2 = new ArrayList(y.r(list, 10));
                while (r1.hasNext()) {
                    i15 = i17 + 1;
                    if (i17 >= 0) {
                        x.q();
                        throw null;
                    }
                    arrayList2.add(o2.c.e(i17, "[", "]: ", (String) obj2, "\n"));
                    i17 = i15;
                }
                String strK1 = h0.k0(arrayList2, null, null, null, null, 63);
                i2.a aVar6 = i2.f36769a;
                a2 a2Var4 = a2.GENERAL;
                aVar6.getClass();
                i2.a.f(a2Var4, "EditProfileImageViewModel", strK1);
                editProfileImageViewModel.f46616v.j(new Exception(strK1));
            }
            editProfileImageViewModel.H0.j(Boolean.valueOf(editProfileImageViewModel.L0));
            editProfileImageViewModel.f46610n.j(Boolean.FALSE);
            return Unit.INSTANCE;
        }
        return aVar2;
    }
}
