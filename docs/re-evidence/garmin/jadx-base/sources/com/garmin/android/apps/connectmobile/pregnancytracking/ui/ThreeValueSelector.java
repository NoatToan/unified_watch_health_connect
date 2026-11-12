package com.garmin.android.apps.connectmobile.pregnancytracking.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.ThreeValueSelector;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/ThreeValueSelector;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/ThreeValueSelector$b;", "optionSelectedListener", "", "setOptionSelectedListener", "(Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/ThreeValueSelector$b;)V", "a", "b", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ThreeValueSelector extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public View f40438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f40439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f40440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f40441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f40442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ImageView f40443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public View f40444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f40445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ImageView f40446i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public b f40447j;

    public interface b {
        void V1(Object obj);
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreeValueSelector(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
        LayoutInflater.from(context).inflate(R.layout.three_option_selctor_layout, (ViewGroup) this, true);
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        View viewFindViewById = findViewById(R.id.option_one);
        viewFindViewById.getClass();
        this.f40438a = viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.option_two);
        viewFindViewById2.getClass();
        this.f40441d = viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.option_three);
        viewFindViewById3.getClass();
        this.f40444g = viewFindViewById3;
        View view2 = this.f40438a;
        if (view2 == null) {
            s.m("mOptionOne");
            throw null;
        }
        View viewFindViewById4 = view2.findViewById(R.id.pregnancy_text_view);
        viewFindViewById4.getClass();
        this.f40439b = (TextView) viewFindViewById4;
        View view3 = this.f40441d;
        if (view3 == null) {
            s.m("mOptionTwo");
            throw null;
        }
        View viewFindViewById5 = view3.findViewById(R.id.pregnancy_text_view);
        viewFindViewById5.getClass();
        this.f40442e = (TextView) viewFindViewById5;
        View view4 = this.f40444g;
        if (view4 == null) {
            s.m("mOptionThree");
            throw null;
        }
        View viewFindViewById6 = view4.findViewById(R.id.pregnancy_text_view);
        viewFindViewById6.getClass();
        this.f40445h = (TextView) viewFindViewById6;
        View view5 = this.f40438a;
        if (view5 == null) {
            s.m("mOptionOne");
            throw null;
        }
        View viewFindViewById7 = view5.findViewById(R.id.pregnancy_check_image_view);
        viewFindViewById7.getClass();
        this.f40440c = (ImageView) viewFindViewById7;
        View view6 = this.f40441d;
        if (view6 == null) {
            s.m("mOptionTwo");
            throw null;
        }
        View viewFindViewById8 = view6.findViewById(R.id.pregnancy_check_image_view);
        viewFindViewById8.getClass();
        this.f40443f = (ImageView) viewFindViewById8;
        View view7 = this.f40444g;
        if (view7 == null) {
            s.m("mOptionThree");
            throw null;
        }
        View viewFindViewById9 = view7.findViewById(R.id.pregnancy_check_image_view);
        viewFindViewById9.getClass();
        this.f40446i = (ImageView) viewFindViewById9;
        View view8 = this.f40438a;
        if (view8 == null) {
            s.m("mOptionOne");
            throw null;
        }
        final int i14 = 0;
        view8.setOnClickListener(new View.OnClickListener(this) { // from class: eb1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeValueSelector f63676b;

            {
                this.f63676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view9) {
                switch (i14) {
                    case 0:
                        ThreeValueSelector threeValueSelector = this.f63676b;
                        ImageView imageView = threeValueSelector.f40440c;
                        if (imageView == null) {
                            s.m("mOptionOneCheckImage");
                            throw null;
                        }
                        imageView.setVisibility(0);
                        ImageView imageView2 = threeValueSelector.f40443f;
                        if (imageView2 == null) {
                            s.m("mOptionTwoCheckImage");
                            throw null;
                        }
                        imageView2.setVisibility(8);
                        ImageView imageView3 = threeValueSelector.f40446i;
                        if (imageView3 == null) {
                            s.m("mOptionThreeCheckImage");
                            throw null;
                        }
                        imageView3.setVisibility(8);
                        ThreeValueSelector.b bVar = threeValueSelector.f40447j;
                        if (bVar != null) {
                            View view10 = threeValueSelector.f40438a;
                            if (view10 == null) {
                                s.m("mOptionOne");
                                throw null;
                            }
                            Object tag = view10.getTag();
                            tag.getClass();
                            bVar.V1(tag);
                            return;
                        }
                        return;
                    case 1:
                        ThreeValueSelector threeValueSelector2 = this.f63676b;
                        ImageView imageView4 = threeValueSelector2.f40440c;
                        if (imageView4 == null) {
                            s.m("mOptionOneCheckImage");
                            throw null;
                        }
                        imageView4.setVisibility(8);
                        ImageView imageView5 = threeValueSelector2.f40443f;
                        if (imageView5 == null) {
                            s.m("mOptionTwoCheckImage");
                            throw null;
                        }
                        imageView5.setVisibility(0);
                        ImageView imageView6 = threeValueSelector2.f40446i;
                        if (imageView6 == null) {
                            s.m("mOptionThreeCheckImage");
                            throw null;
                        }
                        imageView6.setVisibility(8);
                        ThreeValueSelector.b bVar2 = threeValueSelector2.f40447j;
                        if (bVar2 != null) {
                            View view11 = threeValueSelector2.f40441d;
                            if (view11 == null) {
                                s.m("mOptionTwo");
                                throw null;
                            }
                            Object tag2 = view11.getTag();
                            tag2.getClass();
                            bVar2.V1(tag2);
                            return;
                        }
                        return;
                    default:
                        ThreeValueSelector threeValueSelector3 = this.f63676b;
                        ImageView imageView7 = threeValueSelector3.f40440c;
                        if (imageView7 == null) {
                            s.m("mOptionOneCheckImage");
                            throw null;
                        }
                        imageView7.setVisibility(8);
                        ImageView imageView8 = threeValueSelector3.f40443f;
                        if (imageView8 == null) {
                            s.m("mOptionTwoCheckImage");
                            throw null;
                        }
                        imageView8.setVisibility(8);
                        ImageView imageView9 = threeValueSelector3.f40446i;
                        if (imageView9 == null) {
                            s.m("mOptionThreeCheckImage");
                            throw null;
                        }
                        imageView9.setVisibility(0);
                        ThreeValueSelector.b bVar3 = threeValueSelector3.f40447j;
                        if (bVar3 != null) {
                            View view12 = threeValueSelector3.f40444g;
                            if (view12 == null) {
                                s.m("mOptionThree");
                                throw null;
                            }
                            Object tag3 = view12.getTag();
                            tag3.getClass();
                            bVar3.V1(tag3);
                            return;
                        }
                        return;
                }
            }
        });
        View view9 = this.f40441d;
        if (view9 == null) {
            s.m("mOptionTwo");
            throw null;
        }
        final int i15 = 1;
        view9.setOnClickListener(new View.OnClickListener(this) { // from class: eb1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeValueSelector f63676b;

            {
                this.f63676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view10) {
                switch (i15) {
                    case 0:
                        ThreeValueSelector threeValueSelector = this.f63676b;
                        ImageView imageView = threeValueSelector.f40440c;
                        if (imageView == null) {
                            s.m("mOptionOneCheckImage");
                            throw null;
                        }
                        imageView.setVisibility(0);
                        ImageView imageView2 = threeValueSelector.f40443f;
                        if (imageView2 == null) {
                            s.m("mOptionTwoCheckImage");
                            throw null;
                        }
                        imageView2.setVisibility(8);
                        ImageView imageView3 = threeValueSelector.f40446i;
                        if (imageView3 == null) {
                            s.m("mOptionThreeCheckImage");
                            throw null;
                        }
                        imageView3.setVisibility(8);
                        ThreeValueSelector.b bVar = threeValueSelector.f40447j;
                        if (bVar != null) {
                            View view11 = threeValueSelector.f40438a;
                            if (view11 == null) {
                                s.m("mOptionOne");
                                throw null;
                            }
                            Object tag = view11.getTag();
                            tag.getClass();
                            bVar.V1(tag);
                            return;
                        }
                        return;
                    case 1:
                        ThreeValueSelector threeValueSelector2 = this.f63676b;
                        ImageView imageView4 = threeValueSelector2.f40440c;
                        if (imageView4 == null) {
                            s.m("mOptionOneCheckImage");
                            throw null;
                        }
                        imageView4.setVisibility(8);
                        ImageView imageView5 = threeValueSelector2.f40443f;
                        if (imageView5 == null) {
                            s.m("mOptionTwoCheckImage");
                            throw null;
                        }
                        imageView5.setVisibility(0);
                        ImageView imageView6 = threeValueSelector2.f40446i;
                        if (imageView6 == null) {
                            s.m("mOptionThreeCheckImage");
                            throw null;
                        }
                        imageView6.setVisibility(8);
                        ThreeValueSelector.b bVar2 = threeValueSelector2.f40447j;
                        if (bVar2 != null) {
                            View view12 = threeValueSelector2.f40441d;
                            if (view12 == null) {
                                s.m("mOptionTwo");
                                throw null;
                            }
                            Object tag2 = view12.getTag();
                            tag2.getClass();
                            bVar2.V1(tag2);
                            return;
                        }
                        return;
                    default:
                        ThreeValueSelector threeValueSelector3 = this.f63676b;
                        ImageView imageView7 = threeValueSelector3.f40440c;
                        if (imageView7 == null) {
                            s.m("mOptionOneCheckImage");
                            throw null;
                        }
                        imageView7.setVisibility(8);
                        ImageView imageView8 = threeValueSelector3.f40443f;
                        if (imageView8 == null) {
                            s.m("mOptionTwoCheckImage");
                            throw null;
                        }
                        imageView8.setVisibility(8);
                        ImageView imageView9 = threeValueSelector3.f40446i;
                        if (imageView9 == null) {
                            s.m("mOptionThreeCheckImage");
                            throw null;
                        }
                        imageView9.setVisibility(0);
                        ThreeValueSelector.b bVar3 = threeValueSelector3.f40447j;
                        if (bVar3 != null) {
                            View view13 = threeValueSelector3.f40444g;
                            if (view13 == null) {
                                s.m("mOptionThree");
                                throw null;
                            }
                            Object tag3 = view13.getTag();
                            tag3.getClass();
                            bVar3.V1(tag3);
                            return;
                        }
                        return;
                }
            }
        });
        View view10 = this.f40444g;
        if (view10 == null) {
            s.m("mOptionThree");
            throw null;
        }
        final int i16 = 2;
        view10.setOnClickListener(new View.OnClickListener(this) { // from class: eb1.f

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ThreeValueSelector f63676b;

            {
                this.f63676b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view11) {
                switch (i16) {
                    case 0:
                        ThreeValueSelector threeValueSelector = this.f63676b;
                        ImageView imageView = threeValueSelector.f40440c;
                        if (imageView == null) {
                            s.m("mOptionOneCheckImage");
                            throw null;
                        }
                        imageView.setVisibility(0);
                        ImageView imageView2 = threeValueSelector.f40443f;
                        if (imageView2 == null) {
                            s.m("mOptionTwoCheckImage");
                            throw null;
                        }
                        imageView2.setVisibility(8);
                        ImageView imageView3 = threeValueSelector.f40446i;
                        if (imageView3 == null) {
                            s.m("mOptionThreeCheckImage");
                            throw null;
                        }
                        imageView3.setVisibility(8);
                        ThreeValueSelector.b bVar = threeValueSelector.f40447j;
                        if (bVar != null) {
                            View view12 = threeValueSelector.f40438a;
                            if (view12 == null) {
                                s.m("mOptionOne");
                                throw null;
                            }
                            Object tag = view12.getTag();
                            tag.getClass();
                            bVar.V1(tag);
                            return;
                        }
                        return;
                    case 1:
                        ThreeValueSelector threeValueSelector2 = this.f63676b;
                        ImageView imageView4 = threeValueSelector2.f40440c;
                        if (imageView4 == null) {
                            s.m("mOptionOneCheckImage");
                            throw null;
                        }
                        imageView4.setVisibility(8);
                        ImageView imageView5 = threeValueSelector2.f40443f;
                        if (imageView5 == null) {
                            s.m("mOptionTwoCheckImage");
                            throw null;
                        }
                        imageView5.setVisibility(0);
                        ImageView imageView6 = threeValueSelector2.f40446i;
                        if (imageView6 == null) {
                            s.m("mOptionThreeCheckImage");
                            throw null;
                        }
                        imageView6.setVisibility(8);
                        ThreeValueSelector.b bVar2 = threeValueSelector2.f40447j;
                        if (bVar2 != null) {
                            View view13 = threeValueSelector2.f40441d;
                            if (view13 == null) {
                                s.m("mOptionTwo");
                                throw null;
                            }
                            Object tag2 = view13.getTag();
                            tag2.getClass();
                            bVar2.V1(tag2);
                            return;
                        }
                        return;
                    default:
                        ThreeValueSelector threeValueSelector3 = this.f63676b;
                        ImageView imageView7 = threeValueSelector3.f40440c;
                        if (imageView7 == null) {
                            s.m("mOptionOneCheckImage");
                            throw null;
                        }
                        imageView7.setVisibility(8);
                        ImageView imageView8 = threeValueSelector3.f40443f;
                        if (imageView8 == null) {
                            s.m("mOptionTwoCheckImage");
                            throw null;
                        }
                        imageView8.setVisibility(8);
                        ImageView imageView9 = threeValueSelector3.f40446i;
                        if (imageView9 == null) {
                            s.m("mOptionThreeCheckImage");
                            throw null;
                        }
                        imageView9.setVisibility(0);
                        ThreeValueSelector.b bVar3 = threeValueSelector3.f40447j;
                        if (bVar3 != null) {
                            View view14 = threeValueSelector3.f40444g;
                            if (view14 == null) {
                                s.m("mOptionThree");
                                throw null;
                            }
                            Object tag3 = view14.getTag();
                            tag3.getClass();
                            bVar3.V1(tag3);
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final void setOptionSelectedListener(b optionSelectedListener) {
        optionSelectedListener.getClass();
        this.f40447j = optionSelectedListener;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/garmin/android/apps/connectmobile/pregnancytracking/ui/ThreeValueSelector$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "gcm-pregnancy-tracking_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
