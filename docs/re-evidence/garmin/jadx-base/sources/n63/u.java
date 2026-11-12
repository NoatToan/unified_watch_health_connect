package n63;

import com.google.maps.android.BuildConfig;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ln63/u;", "Ln63/z;", "<init>", "()V", "Li63/c;", "serializer", "()Li63/c;", "kotlinx-serialization-json"}, k = 1, mv = {2, 1, 0}, xi = 48)
@i63.h(with = v.class)
public final class u extends z {
    public static final u INSTANCE = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f123944a = BuildConfig.TRAVIS;

    private u() {
        super(null);
    }

    @Override // n63.z
    public final String a() {
        return f123944a;
    }

    public final i63.c<u> serializer() {
        return v.f123945a;
    }
}
