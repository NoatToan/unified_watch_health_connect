package defpackage;

import android.graphics.Bitmap;
import android.util.Log;
import com.huawei.animationkit.computationalwallpaper.generator.ResolverResult;
import com.huawei.animationkit.computationalwallpaper.graphicanalysis.impl.AiStrategyImpl;

/* JADX INFO: loaded from: classes23.dex */
public class bfa {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bdx f1059b;
    private final bfh d;

    public bfa() {
        bed bedVar = new bed();
        bedVar.d(new bei()).d(new bef()).d(new bek()).d(new beo()).d(new beg());
        this.f1059b = new bdx(bedVar);
        this.d = new bfh(AiStrategyImpl.a());
    }

    public ResolverResult e(Bitmap bitmap) throws bdo {
        ResolverResult resolverResult = new ResolverResult(this.f1059b.e(bitmap), this.d.b(bitmap));
        Log.i("ImageResolver", resolverResult.getColorResult().toString());
        Log.i("ImageResolver", resolverResult.getAiResult().toString());
        return resolverResult;
    }
}
