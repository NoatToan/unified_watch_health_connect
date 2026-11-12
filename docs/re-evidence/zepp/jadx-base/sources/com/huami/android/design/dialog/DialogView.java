package com.huami.android.design.dialog;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.ImageViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieProperty;
import com.airbnb.lottie.model.KeyPath;
import com.airbnb.lottie.value.LottieFrameInfo;
import com.airbnb.lottie.value.SimpleLottieValueCallback;
import com.huami.android.design.dialog.grid.DialogGridAdapter;
import com.huami.android.design.dialog.pager.CirclePageIndicator;
import com.huami.android.design.dialog.pager.ImageAdapter;
import com.huami.android.design.dialog.pager.ViewPagerLayoutManager;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DialogView extends LinearLayout {
    private final Context a;
    private DialogParams b;
    private TextView c;
    private TextView d;
    private TextView e;
    private Message f;
    private Message g;
    private Message h;
    private Handler i;
    private DialogInterface j;
    private ListView k;
    private DialogChoiceAdapter l;
    private DialogInterface.OnClickListener m;
    private DialogInterface.OnMultiChoiceClickListener n;
    private final View.OnClickListener o;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (DialogView.this.b.isSingleChoice || DialogView.this.b.isSingleChoiceNew) {
                if (DialogView.this.b.isLinkage) {
                    DialogView.this.j.dismiss();
                    DialogView.this.m.onClick(DialogView.this.j, i);
                    return;
                } else {
                    DialogView.this.m.onClick(DialogView.this.j, i);
                    DialogView.this.j.dismiss();
                    return;
                }
            }
            if (DialogView.this.b.isSingleChoiceList) {
                DialogView.this.m.onClick(DialogView.this.j, i);
                DialogView.this.j.dismiss();
                return;
            }
            if (!DialogView.this.b.isSingleChoiceNonCancelable && !DialogView.this.b.isSingleChoiceListCenterNonCancelable) {
                if (DialogView.this.n == null || DialogView.this.b.choiceItems == null) {
                    return;
                }
                DialogView.this.n.onClick(DialogView.this.j, i, DialogView.this.k.isItemChecked(i));
                return;
            }
            int count = DialogView.this.l.getCount();
            for (int i2 = 0; i2 < count; i2++) {
                DialogView.this.l.getItem(i2).checked = DialogView.this.k.isItemChecked(i2);
            }
            DialogView.this.l.notifyDataSetChanged();
            DialogView.this.m.onClick(DialogView.this.j, i);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message messageObtain;
            if (view == DialogView.this.c && DialogView.this.f != null) {
                messageObtain = Message.obtain(DialogView.this.f);
            } else if (view != DialogView.this.d || DialogView.this.g == null) {
                messageObtain = (view != DialogView.this.e || DialogView.this.h == null) ? null : Message.obtain(DialogView.this.h);
            } else {
                messageObtain = Message.obtain(DialogView.this.g);
            }
            if (messageObtain != null) {
                messageObtain.sendToTarget();
            }
            if (DialogView.this.b.cancel) {
                DialogView.this.i.obtainMessage(1, DialogView.this.j).sendToTarget();
            }
        }
    }

    public static final class c extends Handler {
        private static final int b = 1;
        private final WeakReference<DialogInterface> a;

        public c(DialogInterface dialogInterface) {
            this.a = new WeakReference<>(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i == -3 || i == -2 || i == -1) {
                ((DialogInterface.OnClickListener) message.obj).onClick(this.a.get(), message.what);
            } else {
                if (i != 1) {
                    return;
                }
                ((DialogInterface) message.obj).dismiss();
            }
        }
    }

    public DialogView(Context context) {
        this(context, null);
    }

    @Nullable
    private CharSequence getParagraph() {
        if (!TextUtils.isEmpty(this.b.paragraph)) {
            return this.b.paragraph;
        }
        if (TextUtils.isEmpty(this.b.paragraphCharSequence)) {
            return null;
        }
        return this.b.paragraphCharSequence;
    }

    private boolean p() {
        return (TextUtils.isEmpty(this.b.negativeButtonText) && TextUtils.isEmpty(this.b.positiveButtonText) && TextUtils.isEmpty(this.b.neutralButtonText)) ? false : true;
    }

    private boolean q() {
        if (TextUtils.isEmpty(this.b.message) && TextUtils.isEmpty(this.b.messageCharSequence) && TextUtils.isEmpty(this.b.hint) && TextUtils.isEmpty(this.b.editedText)) {
            DialogParams dialogParams = this.b;
            if (!dialogParams.isShowEditText && TextUtils.isEmpty(dialogParams.paragraph) && TextUtils.isEmpty(this.b.paragraphCharSequence)) {
                DialogParams dialogParams2 = this.b;
                if (!dialogParams2.hasCheckBox && TextUtils.isEmpty(dialogParams2.link)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean r() {
        if (!TextUtils.isEmpty(this.b.title)) {
            DialogParams dialogParams = this.b;
            if (dialogParams.contentView != null || dialogParams.choiceItems != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(CirclePageIndicator circlePageIndicator, int i, int i2) {
        circlePageIndicator.onPageSelected(i2);
        int i3 = i - 1;
        circlePageIndicator.setVisibility(i2 == i3 ? 8 : 0);
        this.d.setVisibility(i2 == i3 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ ColorFilter t(LottieFrameInfo lottieFrameInfo) {
        return new PorterDuffColorFilter(getResources().getColor(R.color.s1), PorterDuff.Mode.SRC_ATOP);
    }

    private void u(int i, DialogInterface.OnClickListener onClickListener, Message message) {
        if (message == null && onClickListener != null) {
            message = this.i.obtainMessage(i, onClickListener);
        }
        if (i == -3) {
            this.h = message;
        } else if (i == -2) {
            this.f = message;
        } else {
            if (i != -1) {
                throw new IllegalArgumentException("Button does not exist");
            }
            this.g = message;
        }
    }

    private void v(TextView textView, DialogParams.ButtonTextStyle buttonTextStyle) {
        if (textView == null || buttonTextStyle == null || getContext() == null) {
            return;
        }
        if (buttonTextStyle.textSize != 0) {
            textView.setTextSize(0, getResources().getDimension(buttonTextStyle.textSize));
        }
        textView.setTypeface(Typeface.SANS_SERIF, buttonTextStyle.isTextBold ? 1 : 0);
        textView.setTextColor(ContextCompat.getColor(getContext(), buttonTextStyle.textColor));
    }

    private void w() {
        List<?> list = this.b.urls;
        if (list == null || list.isEmpty()) {
            if (r()) {
                View viewInflate = LinearLayout.inflate(this.a, R.layout.abcd_dialog_panel_title, this);
                ((TextView) viewInflate.findViewById(R.id.dialog_title)).setText(this.b.title);
                if (!this.b.headerDividingLineVisible) {
                    viewInflate.findViewById(R.id.header_dividing_line).setVisibility(8);
                }
            }
            y();
            if (p()) {
                x();
                return;
            }
            return;
        }
        View viewInflate2 = LinearLayout.inflate(this.a, R.layout.abcd_dialog_panel_content_image, this);
        ((TextView) viewInflate2.findViewById(R.id.dialog_image_title)).setText(this.b.title);
        ((TextView) viewInflate2.findViewById(R.id.dialog_image_message)).setText(this.b.paragraph);
        RecyclerView recyclerView = (RecyclerView) viewInflate2.findViewById(R.id.dialog_image_recyclerview);
        recyclerView.setAdapter(new ImageAdapter(this.b.urls));
        TextView textView = (TextView) viewInflate2.findViewById(R.id.dialog_image_positive_button);
        this.d = textView;
        textView.setText(this.b.positiveButtonText);
        this.d.setOnClickListener(this.o);
        u(-1, this.b.positiveListener, null);
        final CirclePageIndicator circlePageIndicator = (CirclePageIndicator) viewInflate2.findViewById(R.id.dialog_image_indicator);
        final int size = this.b.urls.size();
        circlePageIndicator.setPageNum(size);
        ViewPagerLayoutManager viewPagerLayoutManager = new ViewPagerLayoutManager(getContext());
        viewPagerLayoutManager.setOnViewPagerListener(new ViewPagerLayoutManager.OnViewPagerListener() { // from class: la1
            @Override // com.huami.android.design.dialog.pager.ViewPagerLayoutManager.OnViewPagerListener
            public /* synthetic */ void onInitComplete() {
                ob8.a(this);
            }

            @Override // com.huami.android.design.dialog.pager.ViewPagerLayoutManager.OnViewPagerListener
            public /* synthetic */ void onPageRelease(boolean z, int i) {
                ob8.b(this, z, i);
            }

            @Override // com.huami.android.design.dialog.pager.ViewPagerLayoutManager.OnViewPagerListener
            public final void onPageSelected(int i) {
                this.a.s(circlePageIndicator, size, i);
            }
        });
        recyclerView.setLayoutManager(viewPagerLayoutManager);
    }

    private void x() {
        if (this.b.themed) {
            View viewInflate = LinearLayout.inflate(this.a, R.layout.abcd_dialog_panel_bottom_themed, this);
            if (!TextUtils.isEmpty(this.b.negativeButtonText)) {
                TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_negative_themed_button);
                this.c = textView;
                textView.setVisibility(0);
                this.c.setText(this.b.negativeButtonText);
                this.c.setOnClickListener(this.o);
                u(-2, this.b.negativeListener, null);
            }
            if (TextUtils.isEmpty(this.b.positiveButtonText)) {
                return;
            }
            TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_positive_themed_button);
            this.d = textView2;
            textView2.setText(this.b.positiveButtonText);
            this.d.setOnClickListener(this.o);
            u(-1, this.b.positiveListener, null);
            return;
        }
        View viewInflate2 = LinearLayout.inflate(this.a, R.layout.abcd_dialog_panel_bottom, this);
        View viewFindViewById = viewInflate2.findViewById(R.id.dialog_bottom_panel);
        this.c = (TextView) viewInflate2.findViewById(R.id.dialog_negative_button);
        this.d = (TextView) viewInflate2.findViewById(R.id.dialog_positive_button);
        this.e = (TextView) viewInflate2.findViewById(R.id.dialog_neutral_button);
        if (!TextUtils.isEmpty(this.b.negativeButtonText)) {
            this.e.setVisibility(8);
            this.c.setText(this.b.negativeButtonText);
            this.c.setOnClickListener(this.o);
            v(this.c, this.b.negativeButtonTextStyle);
            u(-2, this.b.negativeListener, null);
        }
        if (!TextUtils.isEmpty(this.b.positiveButtonText)) {
            this.e.setVisibility(8);
            this.d.setText(this.b.positiveButtonText);
            this.d.setOnClickListener(this.o);
            v(this.d, this.b.positiveButtonTextStyle);
            u(-1, this.b.positiveListener, null);
        }
        if (TextUtils.isEmpty(this.b.neutralButtonText)) {
            return;
        }
        this.e.setVisibility(0);
        viewFindViewById.setVisibility(8);
        this.e.setText(this.b.neutralButtonText);
        this.e.setOnClickListener(this.o);
        u(-3, this.b.neutralListener, null);
    }

    private void y() {
        DialogParams dialogParams = this.b;
        View view = dialogParams.contentView;
        if (view != null) {
            if (view.getParent() != null) {
                ((ViewGroup) this.b.contentView.getParent()).removeView(this.b.contentView);
            }
            addView(this.b.contentView);
            return;
        }
        if (dialogParams.choiceItems != null) {
            if (this.k == null) {
                z();
            }
            ListView listView = this.k;
            DialogParams dialogParams2 = this.b;
            listView.setChoiceMode((dialogParams2.isSingleChoice || dialogParams2.isSingleChoiceNew || dialogParams2.isSingleChoiceListCenterNonCancelable || dialogParams2.isSingleChoiceNonCancelable || dialogParams2.isSingleChoiceList) ? 1 : 2);
            if (this.k.getChoiceMode() == 1) {
                this.k.setItemChecked(this.b.choiceItems.j, true);
                return;
            }
            return;
        }
        if (TextUtils.isEmpty(dialogParams.message) && TextUtils.isEmpty(this.b.messageCharSequence) && TextUtils.isEmpty(this.b.title)) {
            return;
        }
        View viewInflate = LinearLayout.inflate(this.a, R.layout.abcd_dialog_panel_content, null);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        addView(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(R.id.dialog_content_title);
        EditText editText = (EditText) viewInflate.findViewById(R.id.dialog_edittext);
        TextView textView2 = (TextView) viewInflate.findViewById(R.id.dialog_subtitle);
        TextView textView3 = (TextView) viewInflate.findViewById(R.id.dialog_message);
        View viewFindViewById = viewInflate.findViewById(R.id.dialog_content_scroll);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) textView.getLayoutParams();
        if (q()) {
            layoutParams.topMargin = 0;
        }
        textView.setLayoutParams(layoutParams);
        if (r() || TextUtils.isEmpty(this.b.title)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(this.b.title);
        }
        if (this.b.drawables != null) {
            RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.dialog_grid);
            recyclerView.setVisibility(0);
            recyclerView.setHasFixedSize(true);
            recyclerView.setAdapter(new DialogGridAdapter(this.b.drawables));
        }
        viewFindViewById.setVisibility(q() ? 0 : 8);
        if (TextUtils.isEmpty(this.b.message)) {
            textView3.setText(this.b.messageCharSequence);
        } else {
            textView3.setText(this.b.message);
        }
        textView3.setGravity(this.b.messageGravity);
        int i = this.b.maxLines;
        if (i != 0) {
            textView3.setMaxLines(i);
        }
        if (!TextUtils.isEmpty(this.b.hint) || !TextUtils.isEmpty(this.b.editedText) || this.b.isShowEditText) {
            editText.setVisibility(0);
            editText.setHint(this.b.hint);
            if (!TextUtils.isEmpty(this.b.editedText)) {
                editText.setText(this.b.editedText);
            }
            TextWatcher textWatcher = this.b.watcher;
            if (textWatcher != null) {
                editText.addTextChangedListener(textWatcher);
            }
            textView3.setVisibility(8);
        }
        CharSequence paragraph = getParagraph();
        if (paragraph != null) {
            textView3.setText(paragraph);
            textView3.setGravity(GravityCompat.START);
        }
        if (this.b.successful != null) {
            FrameLayout frameLayout = (FrameLayout) viewInflate.findViewById(R.id.dialog_image_layout);
            frameLayout.setVisibility(0);
            ImageView imageView = (ImageView) frameLayout.findViewById(R.id.dialog_imageview);
            imageView.setVisibility(0);
            if (this.b.successful.booleanValue()) {
                imageView.setImageResource(R.drawable.ic_done_44);
                ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(ContextCompat.getColor(this.a, R.color.s20)));
            } else {
                imageView.setImageResource(R.drawable.ic_alert_44);
                ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(ContextCompat.getColor(this.a, R.color.p3)));
            }
            if (!TextUtils.isEmpty(this.b.subtitle)) {
                textView2.setVisibility(0);
                textView2.setText(this.b.subtitle);
            }
        }
        if (this.b.loading) {
            FrameLayout frameLayout2 = (FrameLayout) viewInflate.findViewById(R.id.dialog_image_layout);
            frameLayout2.setVisibility(0);
            LottieAnimationView lottieAnimationView = (LottieAnimationView) frameLayout2.findViewById(R.id.dialog_loading);
            lottieAnimationView.setVisibility(0);
            lottieAnimationView.playAnimation();
            lottieAnimationView.addValueCallback(new KeyPath("**"), LottieProperty.COLOR_FILTER, (SimpleLottieValueCallback<ColorFilter>) new SimpleLottieValueCallback() { // from class: ka1
                @Override // com.airbnb.lottie.value.SimpleLottieValueCallback
                public final Object getValue(LottieFrameInfo lottieFrameInfo) {
                    return this.a.t(lottieFrameInfo);
                }
            });
        }
        if (!TextUtils.isEmpty(this.b.link)) {
            TextView textView4 = (TextView) viewInflate.findViewById(R.id.dialog_link);
            textView4.setVisibility(0);
            textView4.setText(this.b.link);
            textView4.setOnClickListener(this.b.linkListener);
        }
        AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) viewInflate.findViewById(R.id.dialog_checkbox);
        appCompatCheckBox.setVisibility(this.b.hasCheckBox ? 0 : 8);
        DialogParams dialogParams3 = this.b;
        if (dialogParams3.hasCheckBox) {
            appCompatCheckBox.setChecked(dialogParams3.isChecked);
            appCompatCheckBox.setText(this.b.checkBoxMessage);
            appCompatCheckBox.setOnCheckedChangeListener(this.b.checkedListener);
        }
    }

    private void z() {
        DialogParams dialogParams = this.b;
        this.m = dialogParams.listener;
        this.n = dialogParams.multiListener;
        Context context = this.a;
        DialogParams dialogParams2 = this.b;
        this.l = new DialogChoiceAdapter(context, dialogParams2.choiceItems, dialogParams2.isSingleChoice, dialogParams2.isSingleChoiceNew, dialogParams2.isSingleChoiceList, dialogParams2.isSingleChoiceNonCancelable, dialogParams2.isSingleChoiceListCenterNonCancelable);
        this.k = new ListView(this.a);
        this.k.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.k.setDividerHeight(0);
        this.k.setSelector(android.R.color.transparent);
        addView(this.k);
        this.k.setAdapter((ListAdapter) this.l);
        this.k.setOnItemClickListener(new a());
        if (this.b.isLinkage) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.abcd_dialog_linkage, (ViewGroup) this.k, false);
            ((TextView) viewInflate.findViewById(R.id.text_link)).setText(this.b.linkText);
            ((TextView) viewInflate.findViewById(R.id.text_link_default)).setText(this.b.linkDefaultText);
            this.k.addFooterView(viewInflate);
        }
    }

    public void setConfig(DialogParams dialogParams, DialogInterface dialogInterface) {
        if (dialogParams != null) {
            this.b = dialogParams;
            this.j = dialogInterface;
            this.i = new c(dialogInterface);
            w();
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = r() ? (TextView) findViewById(R.id.dialog_title) : (TextView) findViewById(R.id.dialog_content_title);
        if (textView == null || textView.getVisibility() != 0) {
            return;
        }
        textView.setText(charSequence);
    }

    public void updatePositiveEnable(boolean z) {
        this.d.setEnabled(z);
        if (z) {
            this.d.setTextColor(ContextCompat.getColor(this.a, R.color.s1));
        } else {
            this.d.setTextColor(ContextCompat.getColor(this.a, R.color.s3));
        }
    }

    public DialogView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DialogView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o = new b();
        setOrientation(1);
        this.a = context;
    }
}
