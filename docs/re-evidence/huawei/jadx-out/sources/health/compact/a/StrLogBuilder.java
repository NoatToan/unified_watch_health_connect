package health.compact.a;

import android.os.Process;
import com.huawei.openalliance.ad.constant.Constants;
import java.util.Calendar;

/* JADX INFO: loaded from: classes2.dex */
class StrLogBuilder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private StringBuilder f36654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f36655c = new StringBuilder(560);

    StrLogBuilder(boolean z) {
        if (z) {
            this.f36654b = new StringBuilder(560);
        }
    }

    public void b(String str) {
        if (this.f36655c.capacity() > 560) {
            this.f36655c = new StringBuilder(560);
        } else {
            StringBuilder sb = this.f36655c;
            sb.delete(0, sb.length());
        }
        StringBuilder sb2 = this.f36654b;
        if (sb2 != null) {
            if (sb2.capacity() > 560) {
                this.f36654b = new StringBuilder(560);
            } else {
                StringBuilder sb3 = this.f36654b;
                sb3.delete(0, sb3.length());
            }
            d(this.f36654b);
            StringBuilder sb4 = this.f36654b;
            sb4.append(str);
            sb4.append("|");
        }
    }

    public int c(String str, String str2, Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return this.f36655c.length();
        }
        if (str != null) {
            this.f36655c.append(str);
        }
        if (str2 != null) {
            StringBuilder sb = this.f36655c;
            sb.append(str2);
            sb.append("|");
        }
        for (Object obj : objArr) {
            this.f36655c.append(obj);
        }
        return this.f36655c.length();
    }

    public String c(int i, int i2) {
        return this.f36655c.substring(i, i2);
    }

    public void e(StringBuffer stringBuffer, String str) {
        StringBuilder sb = this.f36654b;
        if (sb == null || stringBuffer == null) {
            return;
        }
        int length = sb.length();
        if (str != null) {
            StringBuilder sb2 = this.f36654b;
            sb2.append(str);
            sb2.append(System.lineSeparator());
        } else {
            StringBuilder sb3 = this.f36654b;
            sb3.append((CharSequence) this.f36655c);
            sb3.append(System.lineSeparator());
        }
        stringBuffer.append((CharSequence) this.f36654b);
        StringBuilder sb4 = this.f36654b;
        sb4.delete(length, sb4.length());
    }

    private void d(StringBuilder sb) {
        Calendar calendar = Calendar.getInstance();
        sb.append(calendar.get(1));
        c(sb, calendar.get(2) + 1, "", false);
        c(sb, calendar.get(5), Constants.LINK, false);
        c(sb, calendar.get(11), ":", false);
        c(sb, calendar.get(12), ":", false);
        c(sb, calendar.get(13), ".", false);
        c(sb, calendar.get(14), "|", true);
        sb.append(Process.myTid());
        sb.append("|");
    }

    private void c(StringBuilder sb, int i, String str, boolean z) {
        if (z && i < 100) {
            sb.append("0");
        }
        if (i < 10) {
            sb.append("0");
        }
        sb.append(i);
        sb.append(str);
    }
}
