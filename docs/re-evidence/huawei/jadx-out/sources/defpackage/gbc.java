package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.marketing.datatype.SingleGridContent;
import com.huawei.health.marketing.datatype.templates.PopUpListItemsTemplate;
import com.huawei.health.marketing.views.dialog.ListItemsDialogAdapter;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.ui.commonui.R;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.RotateDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.recycleview.HealthRecycleView;
import com.huawei.ui.commonui.subheader.HealthSubHeader;
import health.compact.a.util.LogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes29.dex */
public class gbc extends BaseDialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f34848a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RotateDialog.OnVisibleListenter f34849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ListItemsDialogAdapter f34850c;
    private CountDownLatch d;
    private final List<b> e;
    private View j;

    public gbc(Context context, PopUpListItemsTemplate popUpListItemsTemplate) {
        super(context, R.style.CustomDialog, 0);
        this.e = new ArrayList();
        this.f34848a = context;
        c(popUpListItemsTemplate);
    }

    private void c(PopUpListItemsTemplate popUpListItemsTemplate) {
        View viewInflate = LayoutInflater.from(this.f34848a).inflate(com.huawei.health.servicesui.R.layout.list_items_dialog_layout, (ViewGroup) null);
        this.j = viewInflate;
        HealthRecycleView healthRecycleView = (HealthRecycleView) viewInflate.findViewById(com.huawei.health.servicesui.R.id.list);
        healthRecycleView.setNestedScrollingEnabled(false);
        healthRecycleView.b(false);
        healthRecycleView.e(false);
        this.f34850c = new ListItemsDialogAdapter(this.f34848a);
        healthRecycleView.setLayoutManager(new LinearLayoutManager(this.f34848a, 1, false));
        healthRecycleView.setAdapter(this.f34850c);
        List<SingleGridContent> gridContents = popUpListItemsTemplate.getGridContents();
        this.e.clear();
        if (gridContents != null) {
            Iterator<SingleGridContent> it = gridContents.iterator();
            while (it.hasNext()) {
                this.e.add(new b(it.next()));
            }
        }
        a(gridContents != null ? gridContents.size() : 0, this.j.findViewById(com.huawei.health.servicesui.R.id.dialog_card_view));
        this.f34850c.b(this.e);
        ((HealthTextView) this.j.findViewById(com.huawei.health.servicesui.R.id.desc)).setText(popUpListItemsTemplate.getDescription());
        HealthSubHeader healthSubHeader = (HealthSubHeader) this.j.findViewById(com.huawei.health.servicesui.R.id.title);
        healthSubHeader.setSubHeaderBackgroundColor(ContextCompat.getColor(this.f34848a, com.huawei.health.servicesui.R.color.transparent));
        healthSubHeader.setHeadTitleText(popUpListItemsTemplate.getTheme());
        healthSubHeader.setPaddingStartEnd(0.0f, 0.0f);
        healthSubHeader.setMarginStartEnd(0.0f, 0.0f);
        this.j.findViewById(com.huawei.health.servicesui.R.id.close_btn).setOnClickListener(new View.OnClickListener() { // from class: gbh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f34859c.d(view);
            }
        });
        setContentView(this.j);
    }

    /* synthetic */ void d(View view) {
        dismiss();
    }

    private void a(int i, View view) {
        if (i <= 3) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = this.f34848a.getResources().getDimensionPixelSize(com.huawei.health.servicesui.R.dimen.health_common_465dp);
        view.setLayoutParams(layoutParams);
    }

    public void d(RotateDialog.OnVisibleListenter onVisibleListenter) {
        this.f34849b = onVisibleListenter;
    }

    public void b() {
        if (njy.e(this.e) || c()) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: gbd
            @Override // java.lang.Runnable
            public final void run() {
                this.f34852a.d();
            }
        });
    }

    /* synthetic */ void d() {
        final String strB;
        this.d = new CountDownLatch(this.e.size());
        for (final int i = 0; i < this.e.size(); i++) {
            b bVar = this.e.get(i);
            if (bVar != null && (strB = bVar.b()) != null) {
                ThreadPoolManager.c().execute(new Runnable() { // from class: gbg
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f34857a.b(strB, i);
                    }
                });
            }
        }
        try {
            if (!this.d.await(8000L, TimeUnit.MILLISECONDS)) {
                LogUtil.c("ListItemsDialog", "loadItemsBackground failed, cause time out!");
            }
        } catch (InterruptedException e) {
            LogUtil.c("ListItemsDialog", "loadItemsBackground failed, cause exception happened = ", e.getMessage());
        }
        if (c()) {
            LogUtil.c("ListItemsDialog", "loadItemsBackground not show, cause dialog host is destroyed!");
        }
        this.f34850c.notifyDataSetChanged();
        show();
    }

    /* synthetic */ void b(String str, int i) {
        Drawable drawableB = qqf.b(BaseApplication.getContext(), str);
        if (this.e.get(i) != null) {
            this.e.get(i).d(drawableB);
        }
        this.d.countDown();
    }

    private boolean c() {
        Context context = this.f34848a;
        if (context == null) {
            return true;
        }
        if (context instanceof Activity) {
            return ((Activity) context).isFinishing() || ((Activity) this.f34848a).isDestroyed();
        }
        return false;
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        Window window = getWindow();
        window.setGravity(17);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        RotateDialog.OnVisibleListenter onVisibleListenter = this.f34849b;
        if (onVisibleListenter != null) {
            onVisibleListenter.onVisible(true, this.j);
        }
        super.show();
    }

    public static final class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private SingleGridContent f34851c;
        private Drawable d;

        public b(SingleGridContent singleGridContent) {
            this.f34851c = singleGridContent;
        }

        public Drawable d() {
            return this.d;
        }

        public void d(Drawable drawable) {
            this.d = drawable;
        }

        public String e() {
            SingleGridContent singleGridContent = this.f34851c;
            if (singleGridContent != null) {
                return singleGridContent.getLinkValue();
            }
            return null;
        }

        public String b() {
            SingleGridContent singleGridContent = this.f34851c;
            if (singleGridContent != null) {
                return singleGridContent.getPicture();
            }
            return null;
        }
    }
}
