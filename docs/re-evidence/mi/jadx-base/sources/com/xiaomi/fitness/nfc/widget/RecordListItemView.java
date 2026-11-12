package com.xiaomi.fitness.nfc.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.miui.tsmclient.sesdk.OrderData;
import com.miui.tsmclient.util.StringUtils;
import com.tsmclient.smartcard.model.TradeLog;
import defpackage.mri;
import defpackage.o0j;
import defpackage.rji;
import defpackage.sui;

/* JADX INFO: loaded from: classes9.dex */
public class RecordListItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f12654a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f12655b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public View g;
    public ImageView h;

    public RecordListItemView(Context context) {
        super(context);
        this.f12654a = "";
        a();
    }

    public final void a() {
        LayoutInflater.from(getContext()).inflate(sui.f34001k, this);
        this.f12655b = (TextView) findViewById(mri.a5);
        this.c = (TextView) findViewById(mri.i5);
        this.d = (TextView) findViewById(mri.Z4);
        this.e = (TextView) findViewById(mri.e5);
        this.f = (TextView) findViewById(mri.f5);
        this.g = findViewById(mri.k1);
        this.h = (ImageView) findViewById(mri.e2);
    }

    public final void b(TextView textView, String str) {
        if (TextUtils.isEmpty(str)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
    }

    public final boolean c(OrderData.OrderRecordDetail.OrderFlow orderFlow) {
        return (TextUtils.isEmpty(orderFlow.getKey()) && TextUtils.isEmpty(orderFlow.getSubKey()) && TextUtils.isEmpty(orderFlow.getValue()) && TextUtils.isEmpty(orderFlow.getSubValue())) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0087 A[PHI: r1 r2 r3
      0x0087: PHI (r1v15 java.lang.String) = (r1v12 java.lang.String), (r1v20 java.lang.String) binds: [B:20:0x00e5, B:5:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r2v17 java.lang.String) = (r2v16 java.lang.String), (r2v25 java.lang.String) binds: [B:20:0x00e5, B:5:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0087: PHI (r3v11 java.lang.String) = (r3v9 java.lang.String), (r3v17 java.lang.String) binds: [B:20:0x00e5, B:5:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    public void d(Object obj) {
        String str;
        String str2;
        String str3;
        String statusDesc;
        String title;
        String desc;
        String value;
        String subKey;
        String title2;
        String dateFromString;
        String dateFromString2 = this.f12654a;
        if (obj instanceof TradeLog) {
            TradeLog tradeLog = (TradeLog) obj;
            title2 = getResources().getString(o0j.R6);
            str3 = getResources().getString(o0j.I2, Float.valueOf(tradeLog.getAuAmount() / 100.0f)) + getResources().getString(o0j.F2);
            statusDesc = getResources().getString(o0j.C2);
            if (tradeLog.getTradeDate() != null) {
                int length = tradeLog.getTradeDate().length();
                if (length > 4) {
                    dateFromString2 = StringUtils.formatDateFromString(tradeLog.getTradeDate(), "yyyyMMdd", StringUtils.EXPECT_DATE_FORMAT);
                } else if (length == 4) {
                    dateFromString2 = StringUtils.formatDateFromString(tradeLog.getTradeDate(), "MMdd", "MM/dd");
                }
                dateFromString = StringUtils.formatDateFromString(tradeLog.getTradeTime(), StringUtils.SOURCE_TIME_FORMAT, StringUtils.EXPECT_TIME_FORMAT);
            } else {
                dateFromString = dateFromString2;
            }
            String str4 = title2;
            str2 = dateFromString;
            str = dateFromString2;
            dateFromString2 = str4;
        } else if (obj instanceof OrderData.OrderRecord) {
            OrderData.OrderRecord orderRecord = (OrderData.OrderRecord) obj;
            title2 = orderRecord.getTitle();
            if (TextUtils.isEmpty(title2)) {
                title2 = getResources().getString(o0j.S6);
            }
            str3 = getResources().getString(o0j.U5, Float.valueOf(orderRecord.getAmount() / 100.0f)) + getResources().getString(o0j.F2);
            statusDesc = orderRecord.getStatusDesc();
            String time = orderRecord.getTime();
            if (TextUtils.isEmpty(time)) {
                dateFromString = dateFromString2;
            } else {
                String[] strArrSplit = time.split(" ");
                dateFromString2 = strArrSplit[0];
                dateFromString = strArrSplit[1];
            }
            String str5 = title2;
            str2 = dateFromString;
            str = dateFromString2;
            dateFromString2 = str5;
        } else if (obj instanceof OrderData.OrderRecordDetail.OrderFlow) {
            OrderData.OrderRecordDetail.OrderFlow orderFlow = (OrderData.OrderRecordDetail.OrderFlow) obj;
            this.g.setVisibility(8);
            if (c(orderFlow)) {
                this.e.setVisibility(8);
                title = orderFlow.getKey();
                subKey = orderFlow.getSubKey();
                value = orderFlow.getValue();
                desc = orderFlow.getSubValue();
            } else {
                title = orderFlow.getTitle();
                String time2 = orderFlow.getTime();
                int amount = orderFlow.getAmount();
                String string = amount > 0 ? getResources().getString(o0j.O1, Float.valueOf(amount / 100.0f)) : dateFromString2;
                desc = orderFlow.getDesc();
                value = string;
                subKey = time2;
            }
            if (!TextUtils.isEmpty(value)) {
                this.c.setTextColor(getResources().getColor(rji.q));
            }
            String str6 = value;
            statusDesc = desc;
            str = subKey;
            str3 = str6;
            String str7 = title;
            str2 = dateFromString2;
            dateFromString2 = str7;
        } else {
            str = dateFromString2;
            str2 = str;
            str3 = str2;
            statusDesc = str3;
        }
        b(this.f12655b, dateFromString2);
        b(this.c, str3);
        b(this.d, str);
        b(this.e, str2);
        b(this.f, statusDesc);
    }

    public RecordListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12654a = "";
        a();
    }

    public RecordListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f12654a = "";
        a();
    }
}
