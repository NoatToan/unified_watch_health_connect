package cr0;

import com.garmin.proto.generated.GDIInstantInput;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BU\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcr0/k;", "", "", "deviceId", "", "maxSize", "codePage", "", "text", "currentSize", "requestId", "Lcom/garmin/proto/generated/GDIInstantInput$InstantInputStartRequest$Command;", "command", "Lcr0/c;", "encodingUtils", "Lcr0/b;", "deviceStatusFacade", "<init>", "(JIILjava/lang/String;IILcom/garmin/proto/generated/GDIInstantInput$InstantInputStartRequest$Command;Lcr0/c;Lcr0/b;)V", "instant-input_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f55347c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GDIInstantInput.InstantInputStartRequest.Command f55348d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f55349e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f55350f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f55351g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f55352h;

    public k(long j8, int i14, int i15, String str, int i16, int i17, GDIInstantInput.InstantInputStartRequest.Command command, c cVar, b bVar) {
        cVar.getClass();
        bVar.getClass();
        this.f55345a = j8;
        this.f55346b = i14;
        this.f55347c = i17;
        this.f55348d = command;
        this.f55349e = cVar;
        this.f55350f = str;
        this.f55351g = i16;
    }

    public final boolean a() {
        return ((l80.b) KoinJavaComponent.get$default(l80.b.class, null, null, 6, null)).a(this.f55345a);
    }
}
