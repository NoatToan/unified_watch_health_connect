package p008y1;

import p005kotlin.Metadata;
import p3.a0;
import xd2.m0;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a0 f193717a = new a0(new m0(28));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f193718b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"y1/y$a", "Ly1/x;", "foundation"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements x {
        @Override // p008y1.x
        public final float a(float f14, float f15, float f16) {
            float fAbs = Math.abs((f15 + f14) - f14);
            float f17 = (0.3f * f16) - (0.0f * fAbs);
            float f18 = f16 - f17;
            if ((fAbs <= f16) && f18 < fAbs) {
                f17 = f16 - fAbs;
            }
            return f14 - f17;
        }
    }
}
