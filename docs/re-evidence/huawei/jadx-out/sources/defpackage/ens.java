package defpackage;

import android.app.Activity;
import android.os.Message;
import android.widget.ImageView;
import com.huawei.health.ecologydevice.open.BaseCardHandler;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class ens extends BaseCardHandler<Activity> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f33238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f33239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ArrayList<Object> f33240c;
    private ImageView d;
    private int e;

    public void c(int i) {
        this.f33239b = i;
    }

    public ens(Activity activity, Object obj, int i, ImageView imageView, ArrayList<Object> arrayList) {
        super(activity);
        this.f33239b = 1500;
        this.f33240c = arrayList;
        this.d = imageView;
        this.e = i;
        this.f33238a = obj;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.huawei.health.ecologydevice.open.BaseCardHandler
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleMessageWhenReferenceNotNull(Activity activity, Message message) {
        if (message.what != 994) {
            return;
        }
        c();
    }

    private void c() {
        ArrayList<Object> arrayList = this.f33240c;
        if (arrayList == null || arrayList.size() == 0) {
            return;
        }
        if (this.f33240c.size() == this.e) {
            this.e = 0;
        }
        Object obj = this.f33240c.get(this.e);
        this.f33238a = obj;
        this.e++;
        ImageView imageView = this.d;
        if (imageView != null) {
            if (obj instanceof String) {
                imageView.setImageBitmap(elo.c((String) obj));
            }
            Object obj2 = this.f33238a;
            if (obj2 instanceof Integer) {
                this.d.setImageResource(((Integer) obj2).intValue());
            }
        }
        sendEmptyMessageDelayed(994, this.f33239b);
    }
}
