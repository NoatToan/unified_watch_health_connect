package defpackage;

import android.os.Bundle;
import com.huawei.btsportdevice.callback.MessageOrStateCallback;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ehq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private MessageOrStateCallback f32996a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Integer> f32997c;
    private boolean d;

    public ehq(MessageOrStateCallback messageOrStateCallback, List<Integer> list) {
        this.d = false;
        this.f32996a = messageOrStateCallback;
        this.f32997c = list;
        if (list == null) {
            this.d = true;
        }
    }

    public boolean c(int i) {
        return this.d || this.f32997c.contains(Integer.valueOf(i));
    }

    public void a(int i, Bundle bundle) {
        this.f32996a.onNewMessage(i, bundle);
    }

    public void d(String str) {
        this.f32996a.onStateChange(str);
    }
}
