package com.huami.watch.companion.sport.pb;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.huami.watch.companion.R;
import com.huami.watch.util.TimeUtil;
import io.reactivex.annotations.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class PBInfoView extends FrameLayout {
    private TextView mConfirmedPBBtn;
    private View mConfirmedPBView;
    private View mCurrentPBView;
    private TextView mGiveUpPBBtn;
    private TextView mLastPBTimeTv;
    private TextView mLastPBUnitTv;
    private TextView mLastPBValueTv;
    private View mLastPBView;
    public onItemClickListener mOnItemClickListener;
    public onItemLongClickListener mOnItemLongClickListener;
    public onUnConfirmedClickListener mOnUnConfirmedClickListener;
    private ImageView mPBArrowIv;
    private ImageView mPBBgIv;
    private TextView mPBTimeTv;
    private TextView mPBTitleTv;
    private TextView mPBUnitTv;
    private TextView mPBValueTv;
    private View mUnConfirmedContainer;
    private TextView mUnConfirmedLastPBTimeTv;
    private TextView mUnConfirmedLastPBUnitTv;
    private TextView mUnConfirmedLastPBValueTv;
    private View mUnConfirmedLastPBView;
    private TextView mUnConfirmedPBTimeTv;
    private TextView mUnConfirmedPBTitleTv;
    private TextView mUnConfirmedPBUnitTv;
    private TextView mUnConfirmedPBValueTv;
    private View mUnConfirmedPBView;

    public interface onItemClickListener {
        void onItemClick(PersonalBest personalBest);
    }

    public interface onItemLongClickListener {
        void onItemLongClick(PersonalBest personalBest);
    }

    public interface onUnConfirmedClickListener {
        void onConfirmedClick(PersonalBest personalBest);

        void onGiveUpClick(PersonalBest personalBest);
    }

    public PBInfoView(Context context) {
        this(context, null);
    }

    private void fillConfirmedView(final PersonalBest personalBest, PersonalBest personalBest2) {
        if (personalBest != null) {
            this.mPBTitleTv.setText(PBUtil.getPBTitle(getContext(), personalBest.getName()));
            this.mPBBgIv.setImageResource(PBUtil.getItemBgRes(personalBest.getName()));
            if (personalBest.getValue() == 0.0d) {
                this.mPBArrowIv.setVisibility(4);
                this.mPBTimeTv.setText("");
                this.mPBValueTv.setText("--");
                this.mPBUnitTv.setText("");
                return;
            }
            this.mPBArrowIv.setVisibility(0);
            this.mPBTimeTv.setText(TimeUtil.formatDateTime(personalBest.getTimestamp(), "yyyy-MM-dd"));
            this.mPBValueTv.setTextColor(getResources().getColor(R.color.s1));
            this.mPBValueTv.setText(PBUtil.formatPBValue(getContext(), personalBest.getName(), personalBest.getValue()));
            this.mPBUnitTv.setText(PBUtil.getPBUnit(getContext(), personalBest.getName()));
            this.mCurrentPBView.setOnClickListener(new View.OnClickListener() { // from class: go5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.lambda$fillConfirmedView$2(personalBest, view);
                }
            });
            this.mCurrentPBView.setOnLongClickListener(new View.OnLongClickListener() { // from class: jo5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return this.a.lambda$fillConfirmedView$3(personalBest, view);
                }
            });
            if (personalBest2 != null) {
                if (personalBest2.getValue() == 0.0d) {
                    this.mLastPBView.setVisibility(8);
                    return;
                }
                this.mLastPBView.setVisibility(0);
                this.mLastPBValueTv.setText(PBUtil.formatPBValue(getContext(), personalBest2.getName(), personalBest2.getValue()));
                this.mLastPBUnitTv.setText(PBUtil.getPBUnit(getContext(), personalBest2.getName()));
                this.mLastPBTimeTv.setText(TimeUtil.formatDateTime(personalBest2.getTimestamp(), "yyyy-MM-dd"));
            }
        }
    }

    private void fillUnconfirmedView(final PersonalBest personalBest, PersonalBest personalBest2) {
        if (personalBest != null) {
            this.mUnConfirmedPBTitleTv.setText(PBUtil.getPBTitle(getContext(), personalBest.getName()));
            this.mUnConfirmedPBValueTv.setText(PBUtil.formatPBValue(getContext(), personalBest.getName(), personalBest.getValue()));
            this.mUnConfirmedPBTimeTv.setText(TimeUtil.formatDateTime(personalBest.getTimestamp(), "yyyy-MM-dd"));
            this.mUnConfirmedPBUnitTv.setText(PBUtil.getPBUnit(getContext(), personalBest.getName()));
            this.mGiveUpPBBtn.setOnClickListener(new View.OnClickListener() { // from class: io5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.lambda$fillUnconfirmedView$0(personalBest, view);
                }
            });
            this.mConfirmedPBBtn.setOnClickListener(new View.OnClickListener() { // from class: ho5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.lambda$fillUnconfirmedView$1(personalBest, view);
                }
            });
            this.mUnConfirmedPBView.setOnClickListener(new View.OnClickListener() { // from class: com.huami.watch.companion.sport.pb.PBInfoView.1
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    onItemClickListener onitemclicklistener = PBInfoView.this.mOnItemClickListener;
                    if (onitemclicklistener != null) {
                        onitemclicklistener.onItemClick(personalBest);
                    }
                }
            });
            if (personalBest2 == null || personalBest2.getValue() == 0.0d) {
                return;
            }
            this.mUnConfirmedLastPBView.setVisibility(0);
            this.mUnConfirmedLastPBValueTv.setText(PBUtil.formatPBValue(getContext(), personalBest2.getName(), personalBest2.getValue()));
            this.mUnConfirmedLastPBTimeTv.setText(PBUtil.getPBUnit(getContext(), personalBest2.getName()));
            this.mUnConfirmedLastPBUnitTv.setText(TimeUtil.formatDateTime(personalBest2.getTimestamp(), "yyyy-MM-dd"));
        }
    }

    private void initView() {
        this.mConfirmedPBView = findViewById(R.id.view_pb_confirmed);
        this.mCurrentPBView = findViewById(R.id.view_current_pb);
        this.mPBTitleTv = (TextView) findViewById(R.id.tv_pb_title);
        this.mPBTimeTv = (TextView) findViewById(R.id.tv_pb_time);
        this.mPBValueTv = (TextView) findViewById(R.id.tv_pb_value);
        this.mPBUnitTv = (TextView) findViewById(R.id.tv_pb_unit);
        this.mPBBgIv = (ImageView) findViewById(R.id.iv_pb_bg);
        this.mPBArrowIv = (ImageView) findViewById(R.id.iv_pb_arrow);
        this.mLastPBView = findViewById(R.id.view_last_pb);
        this.mLastPBValueTv = (TextView) findViewById(R.id.tv_last_pb_value);
        this.mLastPBUnitTv = (TextView) findViewById(R.id.tv_last_pb_unit);
        this.mLastPBTimeTv = (TextView) findViewById(R.id.tv_last_pb_time);
        this.mUnConfirmedContainer = findViewById(R.id.view_pb_unconfirmed);
        this.mUnConfirmedPBView = findViewById(R.id.view_unconfirmed_pb);
        this.mUnConfirmedPBTitleTv = (TextView) findViewById(R.id.tv_unconfirmed_pb_title);
        this.mUnConfirmedPBValueTv = (TextView) findViewById(R.id.tv_unconfirmed_pb_value);
        this.mUnConfirmedPBTimeTv = (TextView) findViewById(R.id.tv_unconfirmed_pb_time);
        this.mUnConfirmedPBUnitTv = (TextView) findViewById(R.id.tv_unconfirmed_pb_unit);
        this.mGiveUpPBBtn = (TextView) findViewById(R.id.btn_give_up);
        this.mConfirmedPBBtn = (TextView) findViewById(R.id.btn_confirmed);
        this.mUnConfirmedLastPBView = findViewById(R.id.view_unconfirmed_last_pb);
        this.mUnConfirmedLastPBValueTv = (TextView) findViewById(R.id.tv_unconfirmed_last_pb_value);
        this.mUnConfirmedLastPBTimeTv = (TextView) findViewById(R.id.tv_unconfirmed_last_pb_unit);
        this.mUnConfirmedLastPBUnitTv = (TextView) findViewById(R.id.tv_unconfirmed_last_pb_time);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmed$6() {
        playAnimator(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillConfirmedView$2(PersonalBest personalBest, View view) {
        onItemClickListener onitemclicklistener = this.mOnItemClickListener;
        if (onitemclicklistener != null) {
            onitemclicklistener.onItemClick(personalBest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean lambda$fillConfirmedView$3(PersonalBest personalBest, View view) {
        onItemLongClickListener onitemlongclicklistener = this.mOnItemLongClickListener;
        if (onitemlongclicklistener == null) {
            return false;
        }
        onitemlongclicklistener.onItemLongClick(personalBest);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillUnconfirmedView$0(PersonalBest personalBest, View view) {
        onUnConfirmedClickListener onunconfirmedclicklistener = this.mOnUnConfirmedClickListener;
        if (onunconfirmedclicklistener != null) {
            onunconfirmedclicklistener.onGiveUpClick(personalBest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fillUnconfirmedView$1(PersonalBest personalBest, View view) {
        onUnConfirmedClickListener onunconfirmedclicklistener = this.mOnUnConfirmedClickListener;
        if (onunconfirmedclicklistener != null) {
            onunconfirmedclicklistener.onConfirmedClick(personalBest);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAnimator$4(boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (z) {
            this.mUnConfirmedContainer.setAlpha(1.0f - fFloatValue);
            return;
        }
        View view = this.mUnConfirmedContainer;
        view.setTranslationX(view.getWidth() * fFloatValue);
        View view2 = this.mConfirmedPBView;
        view2.setTranslationX(view2.getWidth() * (fFloatValue - 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$playAnimator$5(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = iIntValue;
        setLayoutParams(layoutParams);
        requestLayout();
    }

    private void playAnimator(final boolean z) {
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(300L);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: fo5
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.a.lambda$playAnimator$4(z, valueAnimator);
            }
        });
        duration.setInterpolator(new AccelerateInterpolator());
        duration.start();
        duration.addListener(new AnimatorListenerAdapter() { // from class: com.huami.watch.companion.sport.pb.PBInfoView.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                PBInfoView.this.mUnConfirmedContainer.setVisibility(8);
            }
        });
        int height = this.mUnConfirmedContainer.getHeight() - this.mConfirmedPBView.getHeight();
        if (height > 0) {
            ValueAnimator duration2 = ValueAnimator.ofInt(getHeight(), getHeight() - height).setDuration(200L);
            duration2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: eo5
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.a.lambda$playAnimator$5(valueAnimator);
                }
            });
            duration2.setInterpolator(new AccelerateInterpolator());
            duration2.setStartDelay(200L);
            duration2.start();
        }
    }

    private void setVisible(boolean z, boolean z2) {
        this.mUnConfirmedContainer.setVisibility(z ? 0 : 8);
        this.mLastPBView.setVisibility(z2 ? 0 : 8);
    }

    public void addOnItemClickListener(onItemClickListener onitemclicklistener) {
        this.mOnItemClickListener = onitemclicklistener;
    }

    public void addOnItemLongClickListener(onItemLongClickListener onitemlongclicklistener) {
        this.mOnItemLongClickListener = onitemlongclicklistener;
    }

    public void addonUnConfirmedClickListener(onUnConfirmedClickListener onunconfirmedclicklistener) {
        this.mOnUnConfirmedClickListener = onunconfirmedclicklistener;
    }

    public void confirmed(PersonalBest personalBest, PersonalBest personalBest2) {
        fillConfirmedView(personalBest, personalBest2);
        post(new Runnable() { // from class: ko5
            @Override // java.lang.Runnable
            public final void run() {
                this.a.lambda$confirmed$6();
            }
        });
    }

    public void giveUp() {
        playAnimator(false);
    }

    public void setData(@NonNull HashMap<PBConfig.Status, PersonalBest> map) {
        PersonalBest personalBest = map.get(PBConfig.Status.UNCONFIRMED);
        PersonalBest personalBest2 = map.get(PBConfig.Status.CURRENT);
        PersonalBest personalBest3 = map.get(PBConfig.Status.LAST);
        setVisible(personalBest != null, personalBest3 != null);
        fillUnconfirmedView(personalBest, personalBest2);
        fillConfirmedView(personalBest2, personalBest3);
    }

    public PBInfoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PBInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(context).inflate(R.layout.view_pb_info, this);
        initView();
    }
}
