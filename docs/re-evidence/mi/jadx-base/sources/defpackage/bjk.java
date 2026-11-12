package defpackage;

import android.text.TextUtils;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
@Entity(tableName = "reminder_notice_mapping")
public class bjk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @PrimaryKey
    @ColumnInfo(name = "notice_id")
    public String f4290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @ColumnInfo(name = "remind_id")
    public String f4291b;

    @ColumnInfo(name = "last_notice_time")
    public long c;

    @ColumnInfo(name = "display_duration")
    public long d;

    @ColumnInfo(name = "notification_id")
    public int e;

    public bjk() {
    }

    public bjk(String str, int i, long j) {
        this.f4290a = str;
        this.e = i;
        this.d = j;
    }

    public long a() {
        return this.d;
    }

    public long b() {
        return this.c;
    }

    public String c() {
        return this.f4290a;
    }

    public int d() {
        return this.e;
    }

    public String e() {
        return this.f4291b;
    }

    public boolean f() {
        return (TextUtils.isEmpty(this.f4290a) || TextUtils.isEmpty(this.f4291b) || this.e <= 0) ? false : true;
    }

    public void g(long j) {
        this.c = j;
    }

    public void h(String str) {
        this.f4291b = str;
    }

    public String toString() {
        return "RemindNoticeMapping{noticeId='" + this.f4290a + "', remindId='" + this.f4291b + "', lastNoticeTime=" + this.c + ", displayDuration=" + this.d + ", notificationId=" + this.e + AbstractJsonLexerKt.END_OBJ;
    }
}
