package com.huawei.ui.device.views.music;

import android.content.Context;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.edittext.HealthErrorTipTextLayout;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes16.dex */
public class MusicMenuViewDialog extends BaseDialog {
    public MusicMenuViewDialog(Context context, int i) {
        super(context, i);
    }

    public static class Builder {
        private View.OnClickListener h;
        private Context j;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        MusicMenuViewDialog f25017b = null;
        HealthButton e = null;
        EditText d = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        HealthTextView f25018c = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        HealthErrorTipTextLayout f25016a = null;
        private InputFilter i = new InputFilter() { // from class: com.huawei.ui.device.views.music.MusicMenuViewDialog.Builder.5
            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                boolean z;
                do {
                    try {
                        z = new SpannableStringBuilder(spanned).replace(i3, i4, charSequence.subSequence(i, i2)).toString().getBytes("utf-8").length > 30;
                        if (z) {
                            i2--;
                            charSequence = charSequence.subSequence(i, i2);
                        }
                    } catch (UnsupportedEncodingException unused) {
                        LogUtil.e("MusicMenuViewDialog", "filter UnsupportedEncodingException");
                        return charSequence;
                    }
                } while (z);
                return charSequence;
            }
        };
        private InputFilter f = new InputFilter() { // from class: com.huawei.ui.device.views.music.MusicMenuViewDialog.Builder.3

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Pattern f25020c = Pattern.compile("[🀀-🏿]|[🐀-\u1f7ff]|[☀-⟿]", 66);

            @Override // android.text.InputFilter
            public CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
                if (!this.f25020c.matcher(charSequence).find()) {
                    return null;
                }
                LogUtil.d("MusicMenuViewDialog", "can not insert emoji");
                return "";
            }
        };

        public Builder(Context context) {
            this.j = context;
        }

        public Builder d(View.OnClickListener onClickListener) {
            this.h = onClickListener;
            return this;
        }

        public HealthTextView a() {
            return this.f25018c;
        }

        public EditText c() {
            return this.d;
        }

        public HealthErrorTipTextLayout e() {
            return this.f25016a;
        }

        public MusicMenuViewDialog d() {
            Object systemService = this.j.getSystemService("layout_inflater");
            if (!(systemService instanceof LayoutInflater)) {
                LogUtil.a("MusicMenuViewDialog", "object is not instanceof Inflater");
                return null;
            }
            this.f25017b = new MusicMenuViewDialog(this.j, R.style.TrackDialog);
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.music_create_menu_dialog, (ViewGroup) null);
            this.f25016a = (HealthErrorTipTextLayout) viewInflate.findViewById(R.id.error_tip_text_layout);
            this.d = (EditText) viewInflate.findViewById(R.id.edit);
            this.f25018c = (HealthTextView) viewInflate.findViewById(R.id.dialog_title);
            this.d.setHint(R.string.IDS_hw_health_music_enter_name_of_song_list);
            this.d.setFilters(new InputFilter[]{this.i});
            d(this.d);
            ((HealthButton) viewInflate.findViewById(R.id.cancel)).setOnClickListener(new a());
            HealthButton healthButton = (HealthButton) viewInflate.findViewById(R.id.ok);
            this.e = healthButton;
            healthButton.setEnabled(false);
            this.e.setOnClickListener(new c());
            this.f25017b.addContentView(viewInflate, new ViewGroup.LayoutParams(-1, -2));
            this.f25017b.setContentView(viewInflate);
            return this.f25017b;
        }

        public void b(boolean z) {
            HealthButton healthButton = this.e;
            if (healthButton != null) {
                healthButton.setEnabled(z);
            }
        }

        class c implements View.OnClickListener {
            c() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.f25017b != null) {
                    Builder.this.f25017b.dismiss();
                }
                if (Builder.this.h != null) {
                    Builder.this.h.onClick(view);
                } else {
                    LogUtil.d("MusicMenuViewDialog", "mPositiveButtonClickListener is null in CustomViewDialog");
                }
            }
        }

        class a implements View.OnClickListener {
            a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (Builder.this.f25017b != null) {
                    Builder.this.f25017b.dismiss();
                }
            }
        }

        private void d(EditText editText) {
            ArrayList arrayList = new ArrayList(Arrays.asList(editText.getFilters()));
            arrayList.add(this.f);
            editText.setFilters((InputFilter[]) arrayList.toArray(new InputFilter[arrayList.size()]));
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseDialog, android.app.Dialog
    public void show() {
        Window window = getWindow();
        window.setGravity(80);
        window.setDimAmount(0.2f);
        WindowManager.LayoutParams attributes = window.getAttributes();
        window.getDecorView().setPadding(0, 0, 0, 0);
        attributes.width = -1;
        attributes.height = -2;
        window.setAttributes(attributes);
        window.setWindowAnimations(R.style.track_dialog_anim);
        super.show();
    }
}
