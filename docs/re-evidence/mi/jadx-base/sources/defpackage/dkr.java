package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.view.WidgetGroupView;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class dkr extends RecyclerView.Adapter<a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<ekr> f15635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public p8h f15636b;

    public class a extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WidgetGroupView f15637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ekr f15638b;

        public a(View view) {
            Product.Size size;
            super(view);
            WidgetGroupView widgetGroupView = (WidgetGroupView) view.findViewById(zqi.bb);
            this.f15637a = widgetGroupView;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null && (size = wearableDeviceModel.getProduct().getSize()) != null) {
                widgetGroupView.g(size.getWidth(), size.getHeight(), size.getRadius());
            }
            nuf.f(view);
            view.setOnClickListener(new View.OnClickListener() { // from class: ckr
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f5438a.d(view2);
                }
            });
        }

        private boolean c() {
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            return wearableDeviceModel != null && wearableDeviceModel.getIsDeviceConnected();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(View view) {
            if (!c()) {
                ToastUtil.showShortToast(wzi.q);
            } else if (dkr.this.f15636b != null) {
                dkr.this.f15636b.onItemClick(view, this.f15638b);
            }
        }

        public void b(ekr ekrVar) {
            this.f15638b = ekrVar;
            this.f15637a.setWidgetGroupStyle(ekrVar.b());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<ekr> list = this.f15635a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(a aVar, int i) {
        aVar.b(this.f15635a.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(eui.l1, viewGroup, false));
    }

    public void l(p8h p8hVar) {
        this.f15636b = p8hVar;
    }

    public void setList(List<ekr> list) {
        this.f15635a = list;
    }
}
