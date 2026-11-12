package bb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f17273c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17274a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17275b = -1;

    public final boolean a(String str) {
        Matcher matcher = f17273c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i14 = fa.z.f70071a;
            int i15 = Integer.parseInt(strGroup, 16);
            int i16 = Integer.parseInt(matcher.group(2), 16);
            if (i15 <= 0 && i16 <= 0) {
                return false;
            }
            this.f17274a = i15;
            this.f17275b = i16;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public final void b(androidx.media3.common.w wVar) {
        int i14 = 0;
        while (true) {
            androidx.media3.common.w.b[] bVarArr = wVar.f8574a;
            if (i14 >= bVarArr.length) {
                return;
            }
            androidx.media3.common.w.b bVar = bVarArr[i14];
            if (bVar instanceof pb.e) {
                pb.e eVar = (pb.e) bVar;
                if ("iTunSMPB".equals(eVar.f136801c) && a(eVar.f136802d)) {
                    return;
                }
            } else if (bVar instanceof pb.j) {
                pb.j jVar = (pb.j) bVar;
                if ("com.apple.iTunes".equals(jVar.f136814b) && "iTunSMPB".equals(jVar.f136815c) && a(jVar.f136816d)) {
                    return;
                }
            } else {
                continue;
            }
            i14++;
        }
    }
}
