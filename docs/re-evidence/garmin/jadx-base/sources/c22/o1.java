package c22;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lc22/o1;", "", "<init>", "()V", "a", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f23177a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f23178b = {R.color.palette_swagger_1, R.color.palette_delta_2, R.color.palette_berry_2, R.color.palette_swagger_3, R.color.palette_mango_2};

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lc22/o1$a;", "", "<init>", "()V", "", "AVATAR_COLOR_RES_IDS", "[I", "gcm-common-ui_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        public static String a(Context context, Character ch3) {
            context.getClass();
            if (ch3 != null && Character.isLetter(ch3.charValue())) {
                return String.valueOf(Character.toUpperCase(ch3.charValue()));
            }
            String string = context.getString(R.string.non_letter_section_header);
            string.getClass();
            return string;
        }

        private a() {
        }
    }
}
