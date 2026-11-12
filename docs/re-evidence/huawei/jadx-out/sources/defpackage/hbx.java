package defpackage;

import com.huawei.health.sportservice.utils.SmoothDataParser;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes31.dex */
public class hbx implements SmoothDataParser {
    private Queue<Integer> e = new LinkedList();
    private int d = 0;

    @Override // com.huawei.health.sportservice.utils.SmoothDataParser
    public float getAverage(float f) {
        Integer numPoll;
        this.e.offer(Integer.valueOf((int) f));
        if (this.e.size() > 6 && (numPoll = this.e.poll()) != null) {
            this.d -= numPoll.intValue();
        }
        int i = (int) (this.d + f);
        this.d = i;
        return Math.round(i / this.e.size());
    }

    @Override // com.huawei.health.sportservice.utils.SmoothDataParser
    public void clear() {
        this.e.clear();
        this.d = 0;
    }
}
