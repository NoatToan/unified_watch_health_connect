package jm0;

import a8.g;
import android.content.Context;
import android.graphics.Bitmap;
import android.text.InputFilter;
import android.text.Spanned;
import c22.q;
import com.garmin.android.apps.connectmobile.connections.groups.services.model.GroupDTO;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import d53.k;
import d53.w;
import e23.p;
import g22.n;
import i3.e5;
import java.io.ByteArrayOutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;
import p13.u;
import p3.l0;
import p3.m;
import p3.p0;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Ljm0/e;", "", "<init>", "()V", "a", "", "isShowing", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f99565a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f99566b = {"profileFile", "friendsFile", "thumbnailFile"};

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ljm0/e$a;", "Landroid/text/InputFilter;", "", "maxBytes", "<init>", "(I)V", "gcm-group_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a implements InputFilter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f99567a;

        public a(int i14) {
            this.f99567a = i14;
        }

        @Override // android.text.InputFilter
        public final CharSequence filter(CharSequence charSequence, int i14, int i15, Spanned spanned, int i16, int i17) {
            charSequence.getClass();
            spanned.getClass();
            try {
                String string = spanned.subSequence(0, i16).toString();
                Charset charset = d53.c.f57666b;
                byte[] bytes = string.getBytes(charset);
                bytes.getClass();
                int length = bytes.length;
                byte[] bytes2 = spanned.subSequence(i17, spanned.length()).toString().getBytes(charset);
                bytes2.getClass();
                int length2 = (this.f99567a - length) - bytes2.length;
                if (length2 <= 0) {
                    return "";
                }
                String string2 = charSequence.subSequence(i14, i15).toString();
                byte[] bytes3 = string2.getBytes(charset);
                bytes3.getClass();
                if (bytes3.length <= length2) {
                    return null;
                }
                int iCharCount = 0;
                int length3 = 0;
                while (iCharCount < string2.length()) {
                    int iCodePointAt = string2.codePointAt(iCharCount);
                    char[] chars = Character.toChars(iCodePointAt);
                    chars.getClass();
                    byte[] bytes4 = new String(chars).getBytes(d53.c.f57666b);
                    bytes4.getClass();
                    length3 += bytes4.length;
                    if (length3 > length2) {
                        break;
                    }
                    iCharCount += Character.charCount(iCodePointAt);
                }
                return iCharCount == 0 ? "" : string2.subSequence(0, iCharCount);
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f99568a;

        static {
            int[] iArr = new int[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.values().length];
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_STEP_TRACKING_AND_WALKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_ROAD_CYCLING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_MOUNTAIN_BIKING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_SWIMMING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_TRIATHLON.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_PARASPORTS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_GOLF.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_OTHER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_NOT_DEFINED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            f99568a = iArr;
        }
    }

    private e() {
    }

    public static ArrayList a(Bitmap bitmap) {
        zp0.f[] fVarArr = {k(bitmap, null, null), k(bitmap, 200, 96), k(bitmap, 150, 72)};
        ArrayList arrayList = new ArrayList();
        String[] strArr = f99566b;
        int length = strArr.length;
        for (int i14 = 0; i14 < length; i14++) {
            MultipartBody.Part.Companion companion = MultipartBody.Part.INSTANCE;
            String str = strArr[i14];
            arrayList.add(companion.createFormData(str, e5.g(str, ".", fVarArr[i14].f206589b), RequestBody.Companion.create$default(RequestBody.INSTANCE, fVarArr[i14].f206588a, gz0.a.f80404d, 0, 0, 6, (Object) null)));
        }
        return arrayList;
    }

    public static final com.garmin.android.apps.connectmobile.connections.groups.services.model.e[] b() {
        return new com.garmin.android.apps.connectmobile.connections.groups.services.model.e[]{com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_STEP_TRACKING_AND_WALKING, com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_RUNNING, com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_ROAD_CYCLING, com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_MOUNTAIN_BIKING, com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_SWIMMING, com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_TRIATHLON, com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_PARASPORTS, com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_GOLF, com.garmin.android.apps.connectmobile.connections.groups.services.model.e.ACT_OTHER};
    }

    public static final String c(int i14, Context context) {
        String resourcePackageName = context.getResources().getResourcePackageName(i14);
        String resourceTypeName = context.getResources().getResourceTypeName(i14);
        String resourceEntryName = context.getResources().getResourceEntryName(i14);
        StringBuilder sbI = p6.b.i("android.resource://", resourcePackageName, "/", resourceTypeName, "/");
        sbI.append(resourceEntryName);
        return sbI.toString();
    }

    public static boolean d(GroupDTO.c cVar) {
        return cVar == GroupDTO.c.OWNER || cVar == GroupDTO.c.ADMIN;
    }

    public static boolean e(GroupDTO.c cVar) {
        cVar.getClass();
        return cVar == GroupDTO.c.OWNER || cVar == GroupDTO.c.ADMIN || cVar == GroupDTO.c.MEMBER;
    }

    public static final boolean f(String str, GroupDTO groupDTO) {
        str.getClass();
        groupDTO.getClass();
        return s.g(groupDTO.f31561d, str);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0052  */
    public static boolean g(String str) {
        boolean z14;
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        if (new k("^(https?://)?(((w{3}|[a-zA-Z]{2}-[a-zA-Z]{2}|m|mbasic)\\.)?)(facebook\\.com|fb\\.com|fb\\.me)/(?:[^\\s\\\\()\\[\\]{};:'\",<>«»“”‘’])+$").d(lowerCase) && n.c(str) <= 256) {
            if (androidx.emoji2.text.d.e()) {
                androidx.emoji2.text.d dVarA = androidx.emoji2.text.d.a();
                dVarA.getClass();
                CharSequence charSequenceH = dVarA.h(0, str.length(), 1, str);
                if (charSequenceH instanceof Spanned) {
                    Spanned spanned = (Spanned) charSequenceH;
                    z14 = !(((g[]) spanned.getSpans(0, spanned.length(), g.class)).length == 0);
                } else {
                    z14 = false;
                }
            } else {
                z14 = false;
            }
            if (!z14) {
                return true;
            }
        }
        return false;
    }

    public static boolean h(String str) {
        str.getClass();
        return new k("^@?[a-zA-Z0-9_]{1,15}$").d(str) && n.c(str) <= 16;
    }

    public static boolean i(String str) {
        str.getClass();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return new k("^https?://[\\w-]+(\\.[\\w-]+)+(:\\d{1,5})?([/?#]\\S*)?$").d(lowerCase) && n.c(str) <= 512;
    }

    public static final ArrayList j(List list) {
        list.getClass();
        com.garmin.android.apps.connectmobile.connections.groups.services.model.e[] eVarArrB = b();
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < 9; i14++) {
            com.garmin.android.apps.connectmobile.connections.groups.services.model.e eVar = eVarArrB[i14];
            if (list.contains(eVar)) {
                arrayList.add(eVar);
            }
        }
        return arrayList;
    }

    public static zp0.f k(Bitmap bitmap, Integer num, Integer num2) {
        Bitmap bitmapCopy;
        zp0.f fVarC;
        if (bitmap.getByteCount() / ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES > 2.0f && num == null && num2 == null && (fVarC = q.c(bitmap, 2.0d)) != null) {
            return fVarC;
        }
        if (num == null || num2 == null) {
            Bitmap.Config config = bitmap.getConfig();
            if (config == null) {
                config = Bitmap.Config.ARGB_8888;
            }
            bitmapCopy = bitmap.copy(config, true);
        } else {
            bitmapCopy = Bitmap.createScaledBitmap(bitmap, num.intValue(), num2.intValue(), true);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.PNG;
        bitmapCopy.compress(compressFormat, 100, byteArrayOutputStream);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        bitmapCopy.recycle();
        byteArray.getClass();
        return new zp0.f(byteArray, q.a(compressFormat));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean l(boolean z14, boolean z15, m mVar) {
        x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        m.f135153a.getClass();
        m.a.C2565a c2565a = m.a.f135155b;
        if (objQ == c2565a) {
            objQ = p0.n(Boolean.FALSE);
            mVar.K(objQ);
        }
        p1 p1Var = (p1) objQ;
        Boolean boolValueOf = Boolean.valueOf(z14);
        Boolean boolValueOf2 = Boolean.valueOf(z15);
        boolean zH = mVar.h(z15) | mVar.h(z14);
        Object objQ2 = mVar.q();
        if (zH || objQ2 == c2565a) {
            objQ2 = new f(z15, z14, p1Var, null);
            mVar.K(objQ2);
        }
        l0.f(boolValueOf, boolValueOf2, (p) objQ2, mVar);
        return ((Boolean) p1Var.getF182175a()).booleanValue();
    }

    public static final o13.p<Boolean, String> m(String str) {
        String string = str != null ? w.i0(str).toString() : null;
        if (string == null || string.length() == 0) {
            return new o13.p<>(Boolean.TRUE, null);
        }
        if (new k("^(https?://)?(((w{3}|[a-zA-Z]{2}-[a-zA-Z]{2}|m|mbasic)\\.)?)(facebook\\.com)/?").a(string)) {
            string = "https://www.facebook.com/".concat(new k("^(https?://)?(((w{3}|[a-zA-Z]{2}-[a-zA-Z]{2}|m|mbasic)\\.)?)(facebook\\.com)/?").f(string, ""));
        } else if (!new k("^(https?://)?(((w{3}|[a-zA-Z]{2}-[a-zA-Z]{2}|m|mbasic)\\.)?)(fb\\.com|fb\\.me)/?").a(string)) {
            string = "https://www.facebook.com/".concat(string);
        }
        f99565a.getClass();
        return (i(string) && g(string)) ? new o13.p<>(Boolean.TRUE, string) : new o13.p<>(Boolean.FALSE, str);
    }

    public static final o13.p<Boolean, String> n(String str) {
        CharSequence charSequenceSubSequence;
        boolean z14 = true;
        if (str == null || str.length() == 0) {
            str = null;
        } else if (n.d(str)) {
            char[] cArr = {'@'};
            int length = str.length();
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    charSequenceSubSequence = "";
                    break;
                }
                if (!u.w(cArr, str.charAt(i14))) {
                    charSequenceSubSequence = str.subSequence(i14, str.length());
                    break;
                }
                i14++;
            }
            str = fb1.c.n("@", charSequenceSubSequence.toString());
            f99565a.getClass();
            if (!h(str)) {
                z14 = false;
            }
        }
        return new o13.p<>(Boolean.valueOf(z14), str);
    }

    public static final o13.p<Boolean, String> o(String str) {
        boolean z14 = true;
        if (str == null || str.length() == 0) {
            str = null;
        } else {
            if (!d53.u.y(str, "http://", false) && !d53.u.y(str, "https://", false)) {
                str = "http://".concat(str);
            }
            f99565a.getClass();
            if (!i(str)) {
                z14 = false;
            }
        }
        return new o13.p<>(Boolean.valueOf(z14), str);
    }
}
