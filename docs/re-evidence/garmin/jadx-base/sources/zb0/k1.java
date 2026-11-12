package zb0;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lzb0/k1;", "", "Ll22/b;", "resourceResolver", "<init>", "(Ll22/b;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l22.b f203546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTimeFormatter f203547b;

    public k1(l22.b bVar) {
        bVar.getClass();
        this.f203546a = bVar;
        this.f203547b = DateTimeFormat.forPattern("h:mm a");
    }
}
