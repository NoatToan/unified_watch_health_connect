package x7;

import android.content.Context;
import java.io.File;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.w;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Ljava/io/File;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class a extends w implements e23.a<File> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f189352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f189353b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Context context, b bVar) {
        super(0);
        this.f189352a = context;
        this.f189353b = bVar;
    }

    @Override // e23.a
    public final File invoke() {
        Context context = this.f189352a;
        context.getClass();
        return oe2.f.l(context, this.f189353b.f189354a.concat(".preferences_pb"));
    }
}
