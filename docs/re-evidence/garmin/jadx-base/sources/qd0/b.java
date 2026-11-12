package qd0;

import android.graphics.Bitmap;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import f12.l;
import ib0.g;
import ib0.j;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m12.k;
import o13.r;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import v90.d;
import vb.h;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lqd0/b;", "Lv90/d;", "Lk12/a;", "userRepo", "Lm12/k;", "getAvatarsUseCase", "Lf12/b;", "userAccount", "Lf12/l;", "userSettings", "<init>", "(Lk12/a;Lm12/k;Lf12/b;Lf12/l;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String[] f144464e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String[] f144465f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final MediaType[] f144466g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k12.a f144467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f144468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f12.b f144469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final l f144470d;

    static {
        new a(null);
        f144464e = new String[]{"profileFile", "friendsFile", "thumbnailFile"};
        f144465f = new String[]{"profileFile.png", "friendsFile.png", "thumbnailFile.png"};
        MediaType mediaType = gz0.a.f80404d;
        f144466g = new MediaType[]{mediaType, mediaType, mediaType};
    }

    public b(k12.a aVar, k kVar, f12.b bVar, l lVar) {
        aVar.getClass();
        kVar.getClass();
        bVar.getClass();
        lVar.getClass();
        this.f144467a = aVar;
        this.f144468b = kVar;
        this.f144469c = bVar;
        this.f144470d = lVar;
    }

    public static byte[] c(Bitmap bitmap, int i14, int i15) {
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, i14, i15, false);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmapCreateScaledBitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        if (!bitmapCreateScaledBitmap.equals(bitmap)) {
            bitmapCreateScaledBitmap.recycle();
        }
        byteArray.getClass();
        return byteArray;
    }

    @Override // v90.d
    public final Object a(Bitmap bitmap, j jVar) {
        byte[][] bArr = {c(bitmap, 298, 298), c(bitmap, 120, 120), c(bitmap, 60, 60)};
        ArrayList arrayList = new ArrayList();
        String[] strArr = f144464e;
        int length = strArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            arrayList.add(MultipartBody.Part.INSTANCE.createFormData(strArr[i14], f144465f[i14], RequestBody.Companion.create$default(RequestBody.INSTANCE, bArr[i14], f144466g[i14], 0, 0, 6, (Object) null)));
        }
        Object objD = d(arrayList, new qd0.a(this, 0), jVar);
        return objD == u13.a.COROUTINE_SUSPENDED ? objD : Unit.INSTANCE;
    }

    @Override // v90.d
    public final Object b(String str, g.c cVar) {
        return this.f144468b.a(str, cVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(ArrayList arrayList, qd0.a aVar, v13.c cVar) {
        c cVar2;
        Object next;
        Object next2;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i14 = cVar2.f144474d;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                cVar2.f144474d = i14 - Integer.MIN_VALUE;
            } else {
                cVar2 = new c(this, cVar);
            }
        } else {
            cVar2 = new c(this, cVar);
        }
        Object objJ = cVar2.f144472b;
        u13.a aVar2 = u13.a.COROUTINE_SUSPENDED;
        int i15 = cVar2.f144474d;
        if (i15 == 0) {
            r.b(objJ);
            String userDisplayName = this.f144469c.getUserDisplayName();
            cVar2.f144471a = aVar;
            cVar2.f144474d = 1;
            objJ = this.f144467a.j(userDisplayName, arrayList, cVar2);
            if (objJ == aVar2) {
                return aVar2;
            }
        } else {
            if (i15 != 1) {
                h.z("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            aVar = cVar2.f144471a;
            r.b(objJ);
        }
        List list = (List) objJ;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!s.g(((j12.h) next).getImageType(), "Framed_Profile"));
            j12.h hVar = (j12.h) next;
            Iterator it3 = list.iterator();
            do {
                if (!it3.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it3.next();
            } while (!s.g(((j12.h) next2).getImageType(), "Profile"));
            j12.h hVar2 = (j12.h) next2;
            if (hVar == null) {
                hVar = hVar2;
            }
            String url = hVar != null ? hVar.getUrl() : null;
            if (url != null) {
                aVar.invoke(url);
            }
        } else {
            i2.a aVar3 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar3.getClass();
            i2.a.f(a2Var, "ProfileImageUseCaseImpl", "UPLOAD user avatar -> NULL response!");
        }
        return Unit.INSTANCE;
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\tR\u001c\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lqd0/b$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "", "NAMES", "[Ljava/lang/String;", "FILE_NAMES", "Lokhttp3/MediaType;", "FILE_TYPES", "[Lokhttp3/MediaType;", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
