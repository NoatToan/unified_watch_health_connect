package com.xiaomi.fitness.devicesettings.bluttooth.widget;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.xiaomi.fitness.common.extensions.ToastExtKt;
import com.xiaomi.fitness.common.utils.AppUtil;
import com.xiaomi.fitness.common.utils.ToastUtil;
import com.xiaomi.fitness.device.manager.bean.Product;
import com.xiaomi.fitness.device.manager.export.DeviceManagerExtKt;
import com.xiaomi.fitness.device.manager.export.WearableDeviceManager;
import com.xiaomi.fitness.device.manager.export.WearableDeviceModel;
import com.xiaomi.fitness.devicesettings.bluttooth.widget.view.WidgetGroupView;
import com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil;
import defpackage.e8h;
import defpackage.eui;
import defpackage.ikr;
import defpackage.kyo;
import defpackage.nuf;
import defpackage.p8h;
import defpackage.pir;
import defpackage.wzi;
import defpackage.zqi;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends RecyclerView.Adapter<RecyclerView.d0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<pir> f11982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e8h f11983b;
    public InterfaceC0473a c;
    public p8h d;

    /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0473a {
        void onWidgetGroupAddClick();
    }

    public class b extends RecyclerView.d0 {
        public b(View view) {
            super(view);
            nuf.f(view);
            view.setOnClickListener(new View.OnClickListener() { // from class: jir
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f22846a.c(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c(View view) {
            if (!a.this.l()) {
                ToastExtKt.toastShort(AppUtil.getApp(), wzi.q);
            } else if (a.this.c != null) {
                a.this.c.onWidgetGroupAddClick();
            }
        }

        public void b(pir pirVar) {
            this.itemView.setVisibility(pirVar.d() ? 0 : 8);
        }
    }

    public class c extends RecyclerView.d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ImageView f11985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WidgetGroupView f11986b;
        public pir c;
        public List<WidgetGroupView.a> d;

        /* JADX INFO: renamed from: com.xiaomi.fitness.devicesettings.bluttooth.widget.a$c$a, reason: collision with other inner class name */
        public class C0474a implements ImageLoadUtil.Callback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ WidgetGroupView.a f11987a;

            public C0474a(WidgetGroupView.a aVar) {
                this.f11987a = aVar;
            }

            @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
            public void onFailure(Drawable drawable) {
            }

            @Override // com.xiaomi.fitness.devicesettings.utils.ImageLoadUtil.Callback
            public void onReady(Bitmap bitmap) {
                this.f11987a.d(c.this.itemView.getContext(), bitmap);
                c.this.f11986b.m(c.this.d);
            }
        }

        public c(View view) {
            Product.Size size;
            super(view);
            WidgetGroupView widgetGroupView = (WidgetGroupView) view.findViewById(zqi.bb);
            this.f11986b = widgetGroupView;
            WearableDeviceModel wearableDeviceModel = (WearableDeviceModel) DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).getCurrentDeviceModel();
            if (wearableDeviceModel != null && (size = wearableDeviceModel.getProduct().getSize()) != null) {
                widgetGroupView.g(size.getWidth(), size.getHeight(), size.getRadius());
            }
            ImageView imageView = (ImageView) view.findViewById(zqi.H3);
            this.f11985a = imageView;
            imageView.setOnTouchListener(new View.OnTouchListener() { // from class: kir
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view2, MotionEvent motionEvent) {
                    return this.f23901a.g(view2, motionEvent);
                }
            });
            widgetGroupView.setOnClickListener(new View.OnClickListener() { // from class: lir
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f25113a.h(view2);
                }
            });
        }

        public void e(pir pirVar) {
            this.c = pirVar;
            this.f11986b.setWidgetGroupStyle(pirVar.b());
            this.d = new LinkedList();
            List<kyo> listH = pirVar.h();
            for (int i = 0; i < listH.size(); i++) {
                kyo kyoVar = listH.get(i);
                WidgetGroupView.a aVar = new WidgetGroupView.a(i, kyoVar.c);
                aVar.e(WidgetBeanKt.convert2WidgetBean(kyoVar));
                i(aVar);
                this.d.add(aVar);
            }
            this.f11986b.setItemList(this.d);
        }

        public final void f() {
            if (a.this.f11983b != null) {
                a.this.f11983b.startDragItem(this);
            }
        }

        public final /* synthetic */ boolean g(View view, MotionEvent motionEvent) {
            if (!a.this.l()) {
                ToastUtil.showShortToast(wzi.q);
                return false;
            }
            if (motionEvent.getAction() != 0) {
                return false;
            }
            f();
            return true;
        }

        public final /* synthetic */ void h(View view) {
            if (!a.this.l()) {
                ToastUtil.showShortToast(wzi.q);
            } else if (a.this.d != null) {
                a.this.d.onItemClick(view, this.c);
            }
        }

        public final void i(WidgetGroupView.a aVar) {
            ikr.e(this.itemView.getContext(), aVar.f, new C0474a(aVar));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getCount() {
        List<pir> list = this.f11982a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return this.f11982a.get(i).c() == 2 ? 2 : 1;
    }

    public boolean l() {
        return DeviceManagerExtKt.getInstance(WearableDeviceManager.INSTANCE).isConnected();
    }

    public void m(p8h p8hVar) {
        this.d = p8hVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        pir pirVar = this.f11982a.get(i);
        if (d0Var instanceof c) {
            ((c) d0Var).e(pirVar);
        } else if (d0Var instanceof b) {
            ((b) d0Var).b(pirVar);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = eui.j1;
        if (i == 2) {
            i2 = eui.J2;
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(i2, viewGroup, false);
        return i == 2 ? new b(viewInflate) : new c(viewInflate);
    }

    public void setList(List<pir> list) {
        this.f11982a = list;
    }

    public void setOnDragListener(e8h e8hVar) {
        this.f11983b = e8hVar;
    }

    public void setOnWidgetGroupAddListener(InterfaceC0473a interfaceC0473a) {
        this.c = interfaceC0473a;
    }
}
