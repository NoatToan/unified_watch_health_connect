package z8;

import androidx.room.a0;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.gncs.NotificationConstants;
import com.mapbox.maps.plugin.locationcomponent.ModelSourceWrapper;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\tB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lz8/b;", "", "", NotificationConstants.KEY_DATA_MIME_TYPE, "", "manufacturer", ModelSourceWrapper.TYPE, "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "a", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f202963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f202964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f202965c;

    static {
        new a(null);
    }

    public /* synthetic */ b(int i14, String str, String str2, int i15, j jVar) {
        this(i14, (i15 & 2) != 0 ? null : str, (i15 & 4) != 0 ? null : str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!b.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        b bVar = (b) obj;
        return this.f202963a == bVar.f202963a && s.g(this.f202964b, bVar.f202964b) && s.g(this.f202965c, bVar.f202965c);
    }

    public final int hashCode() {
        int i14 = this.f202963a * 31;
        String str = this.f202964b;
        int iHashCode = (i14 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f202965c;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("Device(type=");
        sb3.append(this.f202963a);
        sb3.append(", manufacturer=");
        sb3.append(this.f202964b);
        sb3.append(", model=");
        return a0.m(sb3, this.f202965c, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006¨\u0006\u0016"}, d2 = {"Lz8/b$a;", "", "<init>", "()V", "", "TYPE_UNKNOWN", "I", "TYPE_WATCH", "TYPE_PHONE", "TYPE_SCALE", "TYPE_RING", "TYPE_HEAD_MOUNTED", "TYPE_FITNESS_BAND", "TYPE_CHEST_STRAP", "TYPE_SMART_DISPLAY", "TYPE_CONSUMER_MEDICAL_DEVICE", "TYPE_GLASSES", "TYPE_HEARABLE", "TYPE_FITNESS_MACHINE", "TYPE_FITNESS_EQUIPMENT", "TYPE_PORTABLE_COMPUTER", "TYPE_METER", "connect-client_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }

    public b(int i14, String str, String str2) {
        this.f202963a = i14;
        this.f202964b = str;
        this.f202965c = str2;
    }
}
