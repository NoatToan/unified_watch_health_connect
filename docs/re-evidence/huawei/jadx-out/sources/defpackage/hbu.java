package defpackage;

import com.huawei.health.sportservice.utils.SmoothDataParser;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes31.dex */
public class hbu implements SmoothDataParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Queue<Float> f36378a = new LinkedList();
    private float e = 0.0f;

    @Override // com.huawei.health.sportservice.utils.SmoothDataParser
    public float getAverage(float f) {
        Float fPoll;
        this.f36378a.offer(Float.valueOf(f));
        if (this.f36378a.size() > 6 && (fPoll = this.f36378a.poll()) != null) {
            this.e -= fPoll.floatValue();
        }
        float f2 = this.e + f;
        this.e = f2;
        return f2 / this.f36378a.size();
    }

    @Override // com.huawei.health.sportservice.utils.SmoothDataParser
    public void clear() {
        this.f36378a.clear();
        this.e = 0.0f;
    }
}
