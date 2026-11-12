package com.xiaomi.hm.health.device.watch_skin;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.lib.view.ViewUtils;
import com.huami.tools.log.HMLog;
import java.util.List;
import java.util.Objects;
import rx.Emitter;
import rx.Observable;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.functions.Action1;
import rx.schedulers.Schedulers;

/* JADX INFO: loaded from: classes19.dex */
class a extends RecyclerView.Adapter<b> {
    private static final String i = "WatchSkinAdapter";
    private static final int j = 2;
    private static final int k = 3;
    private static final int l = 250;
    private final AppCompatActivity a;
    private final RecyclerView b;
    private LoadingDialog c;
    private final int d;
    private final int e;
    private int f;
    private EnumC0886a g = EnumC0886a.NORMAL;
    private List<LocalWatchSkinEntity> h;

    /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watch_skin.a$a, reason: collision with other inner class name */
    public enum EnumC0886a {
        NORMAL,
        DELETE,
        NORMAL_TO_DELETE,
        DELETE_TO_NORMAL
    }

    public class b extends RecyclerView.ViewHolder {
        public final CardView a;
        public final AppCompatImageView b;
        public final AppCompatImageView c;

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.watch_skin.a$b$a, reason: collision with other inner class name */
        public class C0887a extends AnimatorListenerAdapter {
            public C0887a() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                a.this.m();
            }
        }

        public b(View view) {
            super(view);
            CardView cardView = (CardView) view;
            this.a = cardView;
            AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.thumbnail_img);
            this.b = appCompatImageView;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatImageView.getLayoutParams();
            int iG = g();
            RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) cardView.getLayoutParams();
            ((ViewGroup.MarginLayoutParams) layoutParams).width = iG;
            if (a.this.e == 0) {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = iG;
                marginLayoutParams.setMargins((int) ViewUtils.dp2px(a.this.a, 31.0f), (int) ViewUtils.dp2px(a.this.a, 31.0f), (int) ViewUtils.dp2px(a.this.a, 31.0f), (int) ViewUtils.dp2px(a.this.a, 31.0f));
            } else {
                ((ViewGroup.MarginLayoutParams) layoutParams).height = (iG * 4) / 3;
                marginLayoutParams.setMargins((int) ViewUtils.dp2px(a.this.a, 25.0f), (int) ViewUtils.dp2px(a.this.a, 20.0f), (int) ViewUtils.dp2px(a.this.a, 25.0f), (int) ViewUtils.dp2px(a.this.a, 20.0f));
            }
            cardView.setLayoutParams(layoutParams);
            appCompatImageView.setLayoutParams(marginLayoutParams);
            this.c = (AppCompatImageView) view.findViewById(R.id.delete_img);
        }

        private int g() {
            return a.this.e == 0 ? (a.this.b.getWidth() - (a.this.d * 3)) / 2 : (a.this.b.getWidth() - (a.this.d * 4)) / 3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(int i, View view) {
            if (a.this.g != EnumC0886a.NORMAL) {
                return;
            }
            WatchSkinManager.n(a.this.a, (LocalWatchSkinEntity) a.this.h.get(i));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(int i, Emitter emitter) {
            WatchSkinManager.delete(((LocalWatchSkinEntity) a.this.h.get(i)).folderPath);
            emitter.onNext(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(int i, Void r3) {
            a.this.h.remove(i);
            a.this.notifyItemRemoved(i);
            a aVar = a.this;
            aVar.notifyItemRangeChanged(i, aVar.getA());
            a.this.c.setSuccess(a.this.a.getResources().getString(R.string.event_remind_delete_success));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(Throwable th) {
            a.this.c.setFailed(a.this.a.getResources().getString(R.string.event_remind_delete_fail));
            HMLog.i(a.i, "delete exception: " + th, new Object[0]);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(final int i, View view) {
            Observable observableObserveOn = Observable.create(new Action1() { // from class: com.xiaomi.hm.health.device.watch_skin.g
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.i(i, (Emitter) obj);
                }
            }, Emitter.BackpressureMode.BUFFER).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
            final a aVar = a.this;
            observableObserveOn.doOnSubscribe(new Action0() { // from class: com.xiaomi.hm.health.device.watch_skin.d
                @Override // rx.functions.Action0
                public final void call() {
                    a.h(aVar);
                }
            }).subscribe(new Action1() { // from class: com.xiaomi.hm.health.device.watch_skin.f
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.k(i, (Void) obj);
                }
            }, new Action1() { // from class: com.xiaomi.hm.health.device.watch_skin.e
                @Override // rx.functions.Action1
                public final void call(Object obj) {
                    this.a.l((Throwable) obj);
                }
            });
        }

        private void playAnim(boolean z) {
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(250L);
            AppCompatImageView appCompatImageView = this.c;
            float[] fArr = new float[2];
            fArr[0] = z ? 0.0f : 1.0f;
            fArr[1] = z ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(appCompatImageView, "scaleX", fArr);
            AppCompatImageView appCompatImageView2 = this.c;
            float[] fArr2 = new float[2];
            fArr2[0] = z ? 0.0f : 1.0f;
            fArr2[1] = z ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(appCompatImageView2, "scaleY", fArr2);
            AppCompatImageView appCompatImageView3 = this.c;
            float[] fArr3 = new float[2];
            fArr3[0] = z ? 0.0f : 1.0f;
            fArr3[1] = z ? 1.0f : 0.0f;
            ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(appCompatImageView3, "alpha", fArr3);
            animatorSet.addListener(new C0887a());
            animatorSet.play(objectAnimatorOfFloat).with(objectAnimatorOfFloat2).with(objectAnimatorOfFloat3);
            animatorSet.start();
        }

        public void bind(final int i) {
            this.b.setImageBitmap(BitmapFactory.decodeFile(((LocalWatchSkinEntity) a.this.h.get(i)).thumbnailPath));
            this.a.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.watch_skin.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.h(i, view);
                }
            });
            this.c.setOnClickListener(new View.OnClickListener() { // from class: com.xiaomi.hm.health.device.watch_skin.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.m(i, view);
                }
            });
            if (a.this.g == EnumC0886a.NORMAL) {
                this.c.setVisibility(8);
                return;
            }
            if (a.this.g == EnumC0886a.DELETE) {
                this.c.setVisibility(0);
                return;
            }
            if (a.this.g == EnumC0886a.NORMAL_TO_DELETE) {
                this.c.setClickable(true);
                this.c.setVisibility(0);
                playAnim(true);
            } else if (a.this.g == EnumC0886a.DELETE_TO_NORMAL) {
                this.c.setVisibility(0);
                this.c.setClickable(false);
                playAnim(false);
            }
        }
    }

    public a(AppCompatActivity appCompatActivity, RecyclerView recyclerView, int i2, int i3) {
        this.a = appCompatActivity;
        this.b = recyclerView;
        this.e = i2;
        this.d = i3;
    }

    public static /* bridge */ /* synthetic */ void h(a aVar) {
        aVar.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        AppCompatActivity appCompatActivity = this.a;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(appCompatActivity, appCompatActivity.getString(R.string.delete_alarm));
        this.c = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
        this.c.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        GridLayoutManager gridLayoutManager = (GridLayoutManager) this.b.getLayoutManager();
        Objects.requireNonNull(gridLayoutManager);
        int iFindFirstVisibleItemPosition = gridLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = gridLayoutManager.findLastVisibleItemPosition();
        int i2 = this.f + 1;
        this.f = i2;
        if (i2 >= (iFindLastVisibleItemPosition - iFindFirstVisibleItemPosition) + 1) {
            EnumC0886a enumC0886a = this.g;
            if (enumC0886a == EnumC0886a.NORMAL_TO_DELETE) {
                this.g = EnumC0886a.DELETE;
            } else if (enumC0886a == EnumC0886a.DELETE_TO_NORMAL) {
                this.g = EnumC0886a.NORMAL;
            }
            this.f = 0;
        }
    }

    public void doAnim(boolean z) {
        this.g = z ? EnumC0886a.NORMAL_TO_DELETE : EnumC0886a.DELETE_TO_NORMAL;
        this.f = 0;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: getItemCount */
    public int getA() {
        List<LocalWatchSkinEntity> list = this.h;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public boolean isEmpty() {
        List<LocalWatchSkinEntity> list = this.h;
        return list == null || list.size() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@NonNull b bVar, int i2) {
        bVar.bind(i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    @NonNull
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public b onCreateViewHolder(@NonNull ViewGroup viewGroup, int i2) {
        return new b(LayoutInflater.from(this.a).inflate(R.layout.layout_watch_skin_item, viewGroup, false));
    }

    public void setData(List<LocalWatchSkinEntity> list) {
        this.h = list;
        notifyDataSetChanged();
    }
}
