package com.xiaomi.hm.health.ui.smartplay.eventremind;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.lib.view.ViewUtils;
import com.huami.lib.view.quickadapter.BaseQuickAdapter;
import com.huami.lib.view.quickadapter.BaseViewHolder;
import com.huami.lib.view.quickadapter.MultiTypeDelegate;
import com.huami.mifit.analytics.Analytics;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.databases.HMDaoManager;
import com.xiaomi.hm.health.databases.model.Reminder;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import de.greenrobot.event.EventBus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.Observer;

/* JADX INFO: loaded from: classes22.dex */
public class EventRemindAdapter extends BaseQuickAdapter<Object, BaseViewHolder> {
    private static final int D = 36;
    private static final int E = 250;
    private static final int F = 0;
    private static final int G = 1;
    public static final String TAG = "EventRemindAdapter";
    private State A;
    private DeleteItemListener B;
    private int C;

    public interface DeleteItemListener {
        void delete(long j);
    }

    public enum State {
        NORMAL,
        SHOW,
        NORMAL2SHOW,
        SHOW2NORMAL
    }

    public class a extends AnimatorListenerAdapter {
        public final /* synthetic */ ImageView a;

        public a(ImageView imageView) {
            this.a = imageView;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.a.setVisibility(8);
            EventRemindAdapter.this.C();
        }
    }

    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            EventRemindAdapter.this.C();
        }
    }

    public class c extends MultiTypeDelegate<Object> {
        public c() {
        }

        @Override // com.huami.lib.view.quickadapter.MultiTypeDelegate
        public int getItemType(Object obj) {
            return obj instanceof String ? 1 : 0;
        }
    }

    public class d implements Observer<Boolean> {
        public final /* synthetic */ ComparableReminder a;

        public d(ComparableReminder comparableReminder) {
            this.a = comparableReminder;
        }

        @Override // rx.Observer
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Boolean bool) {
            HMLog.i(EventRemindAdapter.TAG, "delete for server result: " + bool, new Object[0]);
            if (bool.booleanValue()) {
                HMDaoManager.getInstance().getReminderDao().delete(this.a.getReminder());
            }
        }

        @Override // rx.Observer
        public void onCompleted() {
        }

        @Override // rx.Observer
        public void onError(Throwable th) {
            if (th != null) {
                th.printStackTrace();
            }
        }
    }

    public static /* synthetic */ class e {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.values().length];
            a = iArr;
            try {
                iArr[State.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.NORMAL2SHOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[State.SHOW2NORMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public EventRemindAdapter(DeleteItemListener deleteItemListener) {
        super((List) null);
        setMultiTypeDelegate(s());
        this.B = deleteItemListener;
    }

    private void A(BaseViewHolder baseViewHolder) {
        ImageView imageView = (ImageView) baseViewHolder.getView(R.id.delete_event_img);
        LinearLayout linearLayout = (LinearLayout) baseViewHolder.getView(R.id.content_container);
        float fDp2px = ViewUtils.isRTL() ? ViewUtils.dp2px(this.mContext, -36.0f) : ViewUtils.dp2px(this.mContext, 36.0f);
        int[] iArr = e.a;
        int i = iArr[this.A.ordinal()];
        if (i == 1) {
            imageView.setVisibility(8);
            linearLayout.setTranslationX(0.0f);
            return;
        }
        if (i == 2) {
            imageView.setVisibility(0);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            linearLayout.setTranslationX(fDp2px);
            return;
        }
        if (i == 3) {
            imageView.setVisibility(8);
            linearLayout.setTranslationX(0.0f);
        } else if (i == 4) {
            imageView.setVisibility(0);
            imageView.setScaleX(1.0f);
            imageView.setScaleY(1.0f);
            linearLayout.setTranslationX(fDp2px);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(250L);
        int i2 = iArr[this.A.ordinal()];
        if (i2 == 3) {
            imageView.setVisibility(0);
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "scaleX", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(imageView, "scaleY", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(imageView, "alpha", 0.0f, 1.0f);
            ObjectAnimator objectAnimatorOfFloat4 = ObjectAnimator.ofFloat(linearLayout, "translationX", 0.0f, fDp2px);
            animatorSet.addListener(new b());
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3).with(objectAnimatorOfFloat4);
            animatorSet.start();
            return;
        }
        if (i2 != 4) {
            return;
        }
        ObjectAnimator objectAnimatorOfFloat5 = ObjectAnimator.ofFloat(imageView, "scaleX", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat6 = ObjectAnimator.ofFloat(imageView, "scaleY", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat7 = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, 0.0f);
        ObjectAnimator objectAnimatorOfFloat8 = ObjectAnimator.ofFloat(linearLayout, "translationX", linearLayout.getTranslationX(), 0.0f);
        animatorSet.addListener(new a(imageView));
        animatorSet.play(objectAnimatorOfFloat5).with(objectAnimatorOfFloat6).with(objectAnimatorOfFloat7).with(objectAnimatorOfFloat8);
        animatorSet.start();
    }

    private void B(final ComparableReminder comparableReminder) {
        new AlertDialogFragment.Builder(this.mContext).setCancelable(true).setTitle(ConfigHelperKt.hasMiliFeature(Feature.SUPPORT_EVENT_REMIND_NEW_NAME) ? R.string.delete_schedule_confirm : R.string.event_remind_dialog_title).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.delete, new DialogInterface.OnClickListener() { // from class: ct1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.a.z(comparableReminder, dialogInterface, i);
            }
        }).show(((AppCompatActivity) this.mContext).getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C() {
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) getRecyclerView().getLayoutManager();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindLastVisibleItemPosition >= this.mData.size()) {
            iFindLastVisibleItemPosition = this.mData.size() - 1;
        }
        int i = 0;
        for (int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition(); iFindFirstVisibleItemPosition <= iFindLastVisibleItemPosition; iFindFirstVisibleItemPosition++) {
            if (!(this.mData.get(iFindFirstVisibleItemPosition) instanceof String)) {
                i++;
            }
        }
        int i2 = this.C + 1;
        this.C = i2;
        if (i2 >= i) {
            State state = this.A;
            if (state == State.NORMAL2SHOW) {
                this.A = State.SHOW;
            } else if (state == State.SHOW2NORMAL) {
                this.A = State.NORMAL;
            }
            this.C = 0;
        }
    }

    private void q(BaseViewHolder baseViewHolder, final ComparableReminder comparableReminder) {
        baseViewHolder.setText(R.id.content_tv, EventRemindManager.r(this.mContext, comparableReminder.getReminder()));
        baseViewHolder.getView(R.id.content_container).setOnClickListener(new View.OnClickListener() { // from class: dt1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.w(comparableReminder, view);
            }
        });
        baseViewHolder.setText(R.id.title_tv, comparableReminder.getReminder().getBody());
        baseViewHolder.getView(R.id.delete_event_img).setOnClickListener(new View.OnClickListener() { // from class: et1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.x(comparableReminder, view);
            }
        });
        int adapterPosition = baseViewHolder.getAdapterPosition();
        if (adapterPosition == this.mData.size() - 1 || (this.mData.get(adapterPosition + 1) instanceof String)) {
            baseViewHolder.getView(R.id.divider).setVisibility(8);
        } else {
            baseViewHolder.getView(R.id.divider).setVisibility(0);
        }
        A(baseViewHolder);
    }

    private void r(BaseViewHolder baseViewHolder, String str) {
        baseViewHolder.getView(R.id.divider).setVisibility(baseViewHolder.getAdapterPosition() == 0 ? 8 : 0);
        baseViewHolder.setText(R.id.title_tv, str);
    }

    private MultiTypeDelegate<Object> s() {
        c cVar = new c();
        cVar.registerItemType(1, R.layout.layout_event_title);
        cVar.registerItemType(0, R.layout.layout_event_remind);
        return cVar;
    }

    private void t(final ComparableReminder comparableReminder) {
        Reminder reminder = comparableReminder.getReminder();
        reminder.setOp(2);
        if (comparableReminder.getRemindType() == -1) {
            u(comparableReminder);
            return;
        }
        Context context = this.mContext;
        final LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(context, context.getString(R.string.event_remind_deleting));
        loadingDialogShowDialog.setCancelable(false);
        EventRemindManager.deleteReminderToDevice(reminder, new EventRemindManager.CallBack() { // from class: ft1
            @Override // com.xiaomi.hm.health.ui.smartplay.eventremind.EventRemindManager.CallBack
            public final void onFinish(boolean z) {
                this.a.y(loadingDialogShowDialog, comparableReminder, z);
            }
        });
    }

    private void u(ComparableReminder comparableReminder) {
        comparableReminder.getReminder().setStatus(-2);
        HMDaoManager.getInstance().getReminderDao().insertOrReplace(comparableReminder.getReminder());
        this.mData.remove(comparableReminder);
        DeleteItemListener deleteItemListener = this.B;
        if (deleteItemListener != null) {
            deleteItemListener.delete(comparableReminder.getReminder().getTime().longValue());
        }
        EventRemindAPI.deleteReminder(comparableReminder.getReminder().getTime().longValue()).compose(RxUtil.ioToMain()).subscribe(new d(comparableReminder));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void w(ComparableReminder comparableReminder, View view) {
        State state = this.A;
        if (state == State.SHOW) {
            Analytics.event(this.mContext, com.xiaomi.hm.health.ui.smartplay.eventremind.a.b, "Click1");
        } else if (state == State.NORMAL) {
            Analytics.event(this.mContext, com.xiaomi.hm.health.ui.smartplay.eventremind.a.b, "Click2");
        }
        this.A = State.NORMAL;
        this.mContext.startActivity(new Intent(this.mContext, (Class<?>) SetEventActivity.class).putExtra("event", comparableReminder.getReminder()));
        ((EventRemindActivity) this.mContext).V();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x(ComparableReminder comparableReminder, View view) {
        B(comparableReminder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void y(LoadingDialog loadingDialog, ComparableReminder comparableReminder, boolean z) {
        HMLog.i(TAG, "delete for device result: " + z, new Object[0]);
        if (!z) {
            loadingDialog.dismiss();
            IconToast.showError(DeviceXFunctionsKt.getContext(), this.mContext.getString(R.string.event_remind_delete_fail));
        } else {
            loadingDialog.setSuccess(this.mContext.getString(R.string.event_remind_delete_success));
            u(comparableReminder);
            EventBus.getDefault().post(new ReminderChangedEvent(1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(ComparableReminder comparableReminder, DialogInterface dialogInterface, int i) {
        t(comparableReminder);
    }

    @Override // com.huami.lib.view.quickadapter.BaseQuickAdapter
    public void convert(BaseViewHolder baseViewHolder, Object obj) {
        int itemViewType = baseViewHolder.getItemViewType();
        if (itemViewType == 0) {
            q(baseViewHolder, (ComparableReminder) obj);
        } else {
            if (itemViewType != 1) {
                return;
            }
            r(baseViewHolder, (String) obj);
        }
    }

    public State getState() {
        return this.A;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public void insertOrReplace(ComparableReminder comparableReminder) {
        ComparableReminder comparableReminder2;
        Iterator it2 = this.mData.iterator();
        while (true) {
            if (!it2.hasNext()) {
                comparableReminder2 = null;
                break;
            }
            Object next = it2.next();
            if (comparableReminder.equals(next)) {
                comparableReminder2 = (ComparableReminder) next;
                break;
            }
        }
        if (comparableReminder2 == null) {
            this.mData.add((T) comparableReminder);
        } else {
            this.mData.remove(comparableReminder2);
            this.mData.add((T) comparableReminder);
        }
    }

    public void setState(State state) {
        this.A = state;
        notifyDataSetChanged();
    }

    public List<ComparableReminder> v() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.mData) {
            if (obj instanceof ComparableReminder) {
                arrayList.add((ComparableReminder) obj);
            }
        }
        return arrayList;
    }
}
