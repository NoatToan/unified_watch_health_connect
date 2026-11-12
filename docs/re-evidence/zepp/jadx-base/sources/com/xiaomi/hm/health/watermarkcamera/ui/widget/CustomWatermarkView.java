package com.xiaomi.hm.health.watermarkcamera.ui.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.Glide;
import com.bumptech.glide.request.target.SimpleTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huami.tools.log.HMLog;
import com.huami.watch.ota.UpdateUtils;
import com.huami.widget.typeface.Font;
import com.huami.widget.typeface.TypefaceManager;
import com.xiaomi.hm.health.watermarkcamera.event.EventWatermarkThumbUpdate;
import com.xiaomi.hm.health.watermarkcamera.utils.ViewUtils;
import com.xiaomi.hm.health.watermarkcamera.utils.WatermarkShareDataUtil;
import com.xiaomi.hm.health.watermarkcamera.web.GetWatermarkAPI;
import de.greenrobot.event.EventBus;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes22.dex */
public class CustomWatermarkView extends View {
    private static final String m = "CustomWatermarkView";
    private static final String n = "^[0-9a-fA-F]{6}$";
    private Context a;
    public int b;
    public int c;
    private Paint d;
    private Typeface e;
    private String f;
    private String g;
    private boolean h;
    private int i;
    public Bitmap j;
    public Bitmap k;
    public List<GetWatermarkAPI.WebMarkDrawData> l;

    public class a extends SimpleTarget<File> {
        private String d;

        public a(String str) {
            this.d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            EventBus.getDefault().post(new EventWatermarkThumbUpdate(CustomWatermarkView.this.i));
        }

        @Override // com.bumptech.glide.request.target.Target
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResourceReady(@NonNull File file, @Nullable Transition<? super File> transition) {
            HMLog.d(CustomWatermarkView.m, "imageUri==" + this.d, new Object[0]);
            if (this.d.equalsIgnoreCase(CustomWatermarkView.this.f)) {
                HMLog.d(CustomWatermarkView.m, "create black bitmap", new Object[0]);
                CustomWatermarkView customWatermarkView = CustomWatermarkView.this;
                if (customWatermarkView.b <= 0 || customWatermarkView.c <= 0) {
                    customWatermarkView.j = BitmapFactory.decodeFile(file.getPath());
                } else {
                    Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath());
                    CustomWatermarkView customWatermarkView2 = CustomWatermarkView.this;
                    customWatermarkView.j = Bitmap.createScaledBitmap(bitmapDecodeFile, customWatermarkView2.b, customWatermarkView2.c, true);
                }
            } else if (this.d.equalsIgnoreCase(CustomWatermarkView.this.g)) {
                HMLog.d(CustomWatermarkView.m, "create white bitmap", new Object[0]);
                CustomWatermarkView customWatermarkView3 = CustomWatermarkView.this;
                if (customWatermarkView3.b <= 0 || customWatermarkView3.c <= 0) {
                    customWatermarkView3.k = BitmapFactory.decodeFile(file.getPath());
                } else {
                    Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(file.getPath());
                    CustomWatermarkView customWatermarkView4 = CustomWatermarkView.this;
                    customWatermarkView3.k = Bitmap.createScaledBitmap(bitmapDecodeFile2, customWatermarkView4.b, customWatermarkView4.c, true);
                }
            } else {
                HMLog.d(CustomWatermarkView.m, "mBlackUrl==" + CustomWatermarkView.this.f, new Object[0]);
                HMLog.d(CustomWatermarkView.m, "mWhiteUrl==" + CustomWatermarkView.this.g, new Object[0]);
            }
            CustomWatermarkView customWatermarkView5 = CustomWatermarkView.this;
            if (customWatermarkView5.j == null || customWatermarkView5.k == null) {
                return;
            }
            HMLog.d(CustomWatermarkView.m, "draw bitmap", new Object[0]);
            CustomWatermarkView.this.invalidate();
            CustomWatermarkView.this.postDelayed(new Runnable() { // from class: com.xiaomi.hm.health.watermarkcamera.ui.widget.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            }, 500L);
        }
    }

    public CustomWatermarkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = context;
        e();
    }

    private void d(Canvas canvas) {
        Map<String, String> watermarkValueMap = WatermarkShareDataUtil.getWatermarkValueMap();
        for (GetWatermarkAPI.WebMarkDrawData webMarkDrawData : this.l) {
            StringBuilder sb = new StringBuilder("");
            HMLog.d(m, "onDraw do :" + webMarkDrawData.key, new Object[0]);
            if (watermarkValueMap.containsKey(webMarkDrawData.key)) {
                String str = watermarkValueMap.get(webMarkDrawData.key);
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                }
            }
            if ("lighter".equalsIgnoreCase(webMarkDrawData.fontWeight)) {
                this.d.setTypeface(Typeface.create(this.e, 0));
            } else {
                this.d.setTypeface(Typeface.create(this.e, 1));
            }
            int i = webMarkDrawData.textAlign;
            if (i == 1) {
                this.d.setTextAlign(Paint.Align.CENTER);
            } else if (i == 2) {
                this.d.setTextAlign(Paint.Align.LEFT);
            } else if (i == 3) {
                this.d.setTextAlign(Paint.Align.RIGHT);
            }
            int i2 = ViewUtils.parse2RealPxBy1080(this.a, webMarkDrawData.left);
            int i3 = ViewUtils.parse2RealPxBy1080(this.a, webMarkDrawData.top);
            float f = ViewUtils.parse2RealPxBy1080(this.a, webMarkDrawData.fontSize);
            this.d.setTextSize(f);
            if (TextUtils.isEmpty(webMarkDrawData.fontColor) || TextUtils.isEmpty(webMarkDrawData.fontAntiColor)) {
                this.d.setColor(this.h ? -16777216 : -1);
            } else {
                Pattern patternCompile = Pattern.compile(n);
                String str2 = patternCompile.matcher(webMarkDrawData.fontColor).matches() ? UpdateUtils.CMD_FILTER + webMarkDrawData.fontColor : "#FFFFFF";
                this.d.setColor(this.h ? Color.parseColor(patternCompile.matcher(webMarkDrawData.fontAntiColor).matches() ? UpdateUtils.CMD_FILTER + webMarkDrawData.fontAntiColor : "#000000") : Color.parseColor(str2));
            }
            Paint.FontMetrics fontMetrics = this.d.getFontMetrics();
            float densityValue = (f / 20.0f) * ViewUtils.getDensityValue(this.a);
            float f2 = fontMetrics.bottom;
            float f3 = ((i3 + (f2 - fontMetrics.top)) - f2) - densityValue;
            HMLog.d(m, "offset=" + densityValue + ",top=" + i3 + ",f.dt =" + fontMetrics.descent + ",f.at=" + fontMetrics.ascent + ",f.top=" + fontMetrics.top + "f.btm=" + fontMetrics.bottom + ",baseY=" + f3 + ",left=" + i2, new Object[0]);
            canvas.drawText(sb.toString(), (float) i2, f3, this.d);
        }
    }

    private void e() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.e = TypefaceManager.get().getTypeface(this.a, Font.DIN_MED);
    }

    public void drawBgWatermark() {
        if (this.j == null) {
            Glide.with(this.a).asFile().load(this.f).into(new a(this.f));
        }
        if (this.k == null) {
            Glide.with(this.a).asFile().load(this.g).into(new a(this.g));
        }
    }

    public void getDrawDatas(String str) {
        this.l = GetWatermarkAPI.getDrawDataByMark(str);
        invalidate();
    }

    public void getDrawDatasFromMark(GetWatermarkAPI.WebWatermark webWatermark) {
        this.l = webWatermark.mMarkDrawDatas;
        this.b = ViewUtils.parse2RealPxBy1080(this.a, webWatermark.mWatermarkPicWidth);
        int i = ViewUtils.parse2RealPxBy1080(this.a, webWatermark.mWatermarkPicHeight);
        this.c = i;
        this.f = webWatermark.mWatermarkBlackPicUrl;
        this.g = webWatermark.mWatermarkWhitePicUrl;
        measure(this.b, i);
        drawBgWatermark();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.j;
        if (bitmap != null && this.k != null) {
            HMLog.w(m, "draw bitmap to canvas", new Object[0]);
            canvas.drawBitmap(this.h ? this.j : this.k, 0.0f, 0.0f, (Paint) null);
        } else if (bitmap != null) {
            HMLog.i(m, "no white watermark bitmap!! please check server", new Object[0]);
            canvas.drawBitmap(this.j, 0.0f, 0.0f, (Paint) null);
        } else if (this.k != null) {
            HMLog.i(m, "no black watermark bitmap!! please check server", new Object[0]);
            canvas.drawBitmap(this.k, 0.0f, 0.0f, (Paint) null);
        } else {
            HMLog.i(m, "no watermark bitmap please check server!!!", new Object[0]);
        }
        if (this.l != null) {
            d(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(this.b, this.c);
    }

    public void recycleBitmap() {
        Bitmap bitmap = this.j;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.j.recycle();
        }
        Bitmap bitmap2 = this.k;
        if (bitmap2 == null || bitmap2.isRecycled()) {
            return;
        }
        this.k.recycle();
    }

    public void setBlackOrWhite(boolean z) {
        this.h = z;
    }

    public void setFragmentPosition(int i) {
        this.i = i;
    }

    public CustomWatermarkView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = context;
        e();
    }
}
