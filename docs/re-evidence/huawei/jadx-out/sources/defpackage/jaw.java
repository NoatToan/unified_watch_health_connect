package defpackage;

import android.content.Intent;
import com.huawei.hwlogsmodel.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class jaw {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Intent[] f38321b;
    private int d;
    private int e = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f38322c = 0;

    public jaw(int i) {
        this.f38321b = new Intent[i + 1];
        this.d = i;
    }

    public boolean b() {
        return this.f38322c == this.e;
    }

    public int c() {
        int i = this.f38322c;
        int i2 = this.e;
        if (i > i2) {
            return i - i2;
        }
        if (i2 == i) {
            return 0;
        }
        return this.f38321b.length - (i2 - i);
    }

    public boolean e() {
        return (this.f38322c + 1) % this.f38321b.length == this.e;
    }

    public void d(Intent intent) {
        if (intent == null || !"action_play_voice".equals(intent.getAction())) {
            LogUtil.j("Track_VoiceIntentBuffer", "[forceInsert] item is null or invalidation.");
            return;
        }
        Intent[] intentArr = this.f38321b;
        int i = this.e;
        intentArr[i] = intent;
        this.f38322c = (i + 1) % intentArr.length;
        LogUtil.d("Track_VoiceIntentBuffer", "insert voice success");
    }

    public boolean a(Intent intent) {
        if (b(intent)) {
            if (intent.getIntExtra("SPEAK_TYPE", -1) == 4) {
                Intent[] intentArr = this.f38321b;
                int i = this.e;
                intentArr[i] = intent;
                this.f38322c = (i + 1) % intentArr.length;
            } else if (!e(intent)) {
                b(intent.getIntExtra("SPEAK_TYPE", -1));
            } else {
                if (e()) {
                    LogUtil.j("Track_VoiceIntentBuffer", "The voicebuffer is full!");
                    return false;
                }
                Intent[] intentArr2 = this.f38321b;
                int i2 = this.f38322c;
                intentArr2[i2] = intent;
                this.f38322c = (i2 + 1) % intentArr2.length;
                LogUtil.d("Track_VoiceIntentBuffer", "insert voice success");
                return true;
            }
        } else {
            if (e()) {
                LogUtil.j("Track_VoiceIntentBuffer", "The voicebuffer is full!");
                return false;
            }
            if (e(intent)) {
                Intent[] intentArr3 = this.f38321b;
                int i3 = this.f38322c;
                intentArr3[i3] = intent;
                this.f38322c = (i3 + 1) % intentArr3.length;
                LogUtil.d("Track_VoiceIntentBuffer", "insert voice success");
                return true;
            }
        }
        return false;
    }

    private void b(int i) {
        int i2;
        int i3 = this.f38322c;
        Intent[] intentArr = this.f38321b;
        int length = (i3 + intentArr.length) - 1;
        int length2 = intentArr.length;
        while (true) {
            i2 = length % length2;
            if (i2 == this.e || i == this.f38321b[i2].getIntExtra("SPEAK_TYPE", -1)) {
                break;
            }
            Intent[] intentArr2 = this.f38321b;
            length = (i2 + intentArr2.length) - 1;
            length2 = intentArr2.length;
        }
        this.f38322c = (i2 + 1) % this.f38321b.length;
    }

    private boolean e(Intent intent) {
        if (intent == null || !"action_play_voice".equals(intent.getAction())) {
            return false;
        }
        if (c() == 0) {
            return true;
        }
        int intExtra = intent.getIntExtra("SPEAK_TYPE", -1);
        int i = this.e;
        if (i >= this.f38322c) {
            while (true) {
                Intent[] intentArr = this.f38321b;
                if (i < intentArr.length) {
                    if (intExtra != 20 && intentArr[i].getIntExtra("SPEAK_TYPE", -1) == intExtra) {
                        return false;
                    }
                    i++;
                } else {
                    for (int i2 = 0; i2 < this.f38322c; i2++) {
                        if (intExtra != 20 && this.f38321b[i2].getIntExtra("SPEAK_TYPE", -1) == intExtra) {
                            return false;
                        }
                    }
                    break;
                }
            }
        } else {
            while (i < this.f38322c) {
                if (intExtra != 20 && this.f38321b[i].getIntExtra("SPEAK_TYPE", -1) == intExtra) {
                    return false;
                }
                i++;
            }
        }
        return true;
    }

    public Intent d() {
        if (b()) {
            LogUtil.j("Track_VoiceIntentBuffer", "The voicebuffer is empty!");
            return null;
        }
        Intent[] intentArr = this.f38321b;
        int i = this.e;
        Intent intent = intentArr[i];
        this.e = (i + 1) % intentArr.length;
        return intent;
    }

    public void a() {
        if (b()) {
            return;
        }
        this.e = 0;
        this.f38322c = 0;
    }

    public String toString() {
        String str = "Buffer size: " + this.d + ", items num: " + c();
        if (b()) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append(" voice type:");
        int i = this.e;
        if (i < this.f38322c) {
            while (i < this.f38322c) {
                sb.append(" ");
                sb.append(this.f38321b[i].getIntExtra("SPEAK_TYPE", -1));
                i++;
            }
        } else {
            while (i < this.f38321b.length) {
                sb.append(" ");
                sb.append(this.f38321b[i].getIntExtra("SPEAK_TYPE", -1));
                i++;
            }
            for (int i2 = 0; i2 < this.f38322c; i2++) {
                sb.append(" ");
                sb.append(this.f38321b[i2].getIntExtra("SPEAK_TYPE", -1));
            }
        }
        return sb.toString();
    }

    private boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("SPEAK_TYPE", -1);
        return intExtra == 3 || intExtra == 5 || intExtra == 4;
    }
}
