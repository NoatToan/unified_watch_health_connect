package defpackage;

import android.content.Intent;
import android.text.TextUtils;
import androidx.room.ColumnInfo;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.xiaomi.fitness.devicesettings.bluttooth.todo.miui.MiuiCursorConstants;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@Entity(tableName = "notice")
public class owg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @ColumnInfo(name = "template")
    public int f29761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(name = "notice_id")
    public String f29762b;

    @Embedded
    public b c;

    @ColumnInfo(name = "notify_id")
    public int d;

    @ColumnInfo(name = "priority")
    public int e;

    @ColumnInfo(name = "importance")
    public int f;

    @ColumnInfo(name = "title")
    public String g;

    @ColumnInfo(name = MiuiCursorConstants.CONTENT)
    public String h;

    @ColumnInfo(name = "big_pic_url")
    public String i;

    @ColumnInfo(name = "intent_uri")
    public String j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @ColumnInfo(name = "delete_intent_uri")
    public String f29763k;

    @ColumnInfo(name = "small_icon")
    public int l;

    @ColumnInfo(name = "icon")
    public int m;

    @ColumnInfo(name = "vibration_pattern")
    public String n;
    public Intent o;
    public Intent p;

    @ColumnInfo(name = "message_producer")
    public String q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @ColumnInfo(name = "group_key")
    public String f29764r;

    @ColumnInfo(name = "actions")
    public List<a> s;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ColumnInfo(name = "name")
        public String f29765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ColumnInfo(name = "intent_uri")
        public String f29766b;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ColumnInfo(name = "channel_id")
        public String f29767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @ColumnInfo(name = "channel_name")
        public String f29768b;

        public void a(String str) {
            this.f29767a = str;
        }

        public void b(String str) {
            this.f29768b = str;
        }
    }

    public static Intent n(String str) {
        if (str == null) {
            return null;
        }
        try {
            return Intent.parseUri(str, 4);
        } catch (URISyntaxException unused) {
            return null;
        }
    }

    public List<a> a() {
        return this.s;
    }

    public String b() {
        return this.i;
    }

    public int c() {
        int i = this.f;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 2;
        }
        if (i != 3) {
            return (i == 4 || i == 5) ? 4 : 3;
        }
        return 3;
    }

    public int d() {
        return Objects.hash("delete", this.f29762b);
    }

    public Intent e() {
        Intent intent = this.p;
        if (intent != null) {
            return intent;
        }
        String str = this.f29763k;
        if (str != null) {
            this.p = n(str);
        }
        return this.p;
    }

    public String f() {
        return this.f29764r;
    }

    public Intent g() {
        Intent intent = this.o;
        if (intent != null) {
            return intent;
        }
        String str = this.j;
        if (str != null) {
            this.o = n(str);
        }
        return this.o;
    }

    public int h() {
        int i = this.f;
        if (i == 1) {
            return -1;
        }
        if (i != 2) {
            if (i == 3) {
                return 1;
            }
            if (i == 4 || i == 5) {
                return 2;
            }
        }
        return 0;
    }

    public String i() {
        return this.q;
    }

    public int j() {
        return this.d;
    }

    public int k() {
        return this.f29761a;
    }

    public long[] l() {
        if (TextUtils.isEmpty(this.n)) {
            return new long[0];
        }
        String[] strArrSplit = this.n.split(";");
        int length = strArrSplit.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            try {
                jArr[i] = Long.parseLong(strArrSplit[i]);
            } catch (NumberFormatException unused) {
                return new long[0];
            }
        }
        return jArr;
    }

    public void m() {
        Intent intent = this.o;
        if (intent != null && this.j == null) {
            this.j = intent.toUri(4);
        }
        Intent intent2 = this.p;
        if (intent2 == null || this.f29763k != null) {
            return;
        }
        this.f29763k = intent2.toUri(4);
    }

    public void o(List<a> list) {
        this.s = list;
    }

    public void p(String str) {
        this.i = str;
    }

    public void q(String str) {
        this.f29764r = str;
    }

    public void r(Intent intent) {
        this.o = intent;
        this.j = null;
    }

    public void s(String str) {
        this.q = str;
    }

    public void t(int i) {
        this.f29761a = i;
    }
}
