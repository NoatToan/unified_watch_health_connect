package defpackage;

import com.huawei.health.suggestion.R;
import com.huawei.health.suggestion.ui.voice.IVoiceContentConstructor;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class idk implements IVoiceContentConstructor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile idk f37514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f37516c = R.raw.sug_e050f;
    private int f = R.raw.sug_e049f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f37515a = R.raw.sug_e046f;
    private int d = R.raw.sug_e047f;
    private int e = R.raw.sug_e048f;

    private idk() {
    }

    public static idk e() {
        if (f37514b == null) {
            synchronized (idk.class) {
                if (f37514b == null) {
                    f37514b = new idk();
                }
            }
        }
        return f37514b;
    }

    private Integer d(int i) {
        if (i == 1) {
            return Integer.valueOf(this.f37516c);
        }
        if (i == 2) {
            return Integer.valueOf(this.f);
        }
        if (i == 3) {
            return Integer.valueOf(this.f37515a);
        }
        if (i == 4) {
            return Integer.valueOf(this.d);
        }
        if (i != 5) {
            return null;
        }
        return Integer.valueOf(this.e);
    }

    private Object b(Integer num) {
        ArrayList arrayList = new ArrayList();
        int iIntValue = num.intValue();
        if (iIntValue == 1) {
            arrayList.add(Integer.valueOf(R.raw.warmup_course_not_download));
            arrayList.add(Integer.valueOf(R.raw.pls_download_warmup_course));
            return arrayList;
        }
        if (iIntValue != 2) {
            return arrayList;
        }
        arrayList.add(Integer.valueOf(R.raw.stretch_course_not_download));
        arrayList.add(Integer.valueOf(R.raw.pls_download_stretch_course));
        return arrayList;
    }

    @Override // com.huawei.health.suggestion.ui.voice.IVoiceContentConstructor
    public Object constructContent(int i, Object obj) {
        if (i == 1) {
            if (obj instanceof Integer) {
                return d(((Integer) obj).intValue());
            }
            return null;
        }
        if (i == 101 && (obj instanceof Integer)) {
            return b((Integer) obj);
        }
        return null;
    }
}
