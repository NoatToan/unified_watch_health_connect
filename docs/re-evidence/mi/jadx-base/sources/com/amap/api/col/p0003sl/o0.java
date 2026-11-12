package com.amap.api.col.p0003sl;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import com.amap.api.services.core.AMapException;
import com.amap.api.services.help.Inputtips;
import com.amap.api.services.help.InputtipsQuery;
import com.amap.api.services.help.Tip;
import com.amap.api.services.interfaces.IInputtipsSearch;
import defpackage.ays;
import defpackage.dvs;
import defpackage.wts;
import defpackage.xts;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class o0 implements IInputtipsSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f6224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Inputtips.InputtipsListener f6225b;
    public Handler c;
    public InputtipsQuery d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            Message messageObtainMessage = y.a().obtainMessage();
            messageObtainMessage.obj = o0.this.f6225b;
            messageObtainMessage.arg1 = 5;
            try {
                try {
                    o0 o0Var = o0.this;
                    ArrayList<? extends Parcelable> arrayListC = o0Var.c(o0Var.d);
                    Bundle bundle = new Bundle();
                    bundle.putParcelableArrayList("result", arrayListC);
                    messageObtainMessage.setData(bundle);
                    messageObtainMessage.what = 1000;
                } catch (AMapException e) {
                    messageObtainMessage.what = e.getErrorCode();
                }
            } finally {
                o0.this.c.sendMessage(messageObtainMessage);
            }
        }
    }

    public o0(Context context, Inputtips.InputtipsListener inputtipsListener) throws AMapException {
        y0 y0VarA = iu.a(context, wts.a(false));
        if (y0VarA.f6352a != iu.c.SuccessCode) {
            String str = y0VarA.f6353b;
            throw new AMapException(str, 1, str, y0VarA.f6352a.a());
        }
        this.f6224a = context.getApplicationContext();
        this.f6225b = inputtipsListener;
        this.c = y.a();
    }

    public final ArrayList<Tip> c(InputtipsQuery inputtipsQuery) throws AMapException {
        try {
            x.c(this.f6224a);
            if (inputtipsQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (inputtipsQuery.getKeyword() == null || inputtipsQuery.getKeyword().equals("")) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new dvs(this.f6224a, inputtipsQuery).m();
        } catch (Throwable th) {
            xts.i(th, "Inputtips", "requestInputtips");
            if (th instanceof AMapException) {
                throw th;
            }
            return null;
        }
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final InputtipsQuery getQuery() {
        return this.d;
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final ArrayList<Tip> requestInputtips() throws AMapException {
        return c(this.d);
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void requestInputtipsAsyn() {
        try {
            ays.a().b(new a());
        } catch (Throwable th) {
            xts.i(th, "Inputtips", "requestInputtipsAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void setInputtipsListener(Inputtips.InputtipsListener inputtipsListener) {
        this.f6225b = inputtipsListener;
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void setQuery(InputtipsQuery inputtipsQuery) {
        this.d = inputtipsQuery;
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void requestInputtips(String str, String str2) throws AMapException {
        requestInputtips(str, str2, null);
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void requestInputtips(String str, String str2, String str3) throws AMapException {
        if (str != null && !str.equals("")) {
            InputtipsQuery inputtipsQuery = new InputtipsQuery(str, str2);
            this.d = inputtipsQuery;
            inputtipsQuery.setType(str3);
            requestInputtipsAsyn();
            return;
        }
        throw new AMapException("无效的参数 - IllegalArgumentException");
    }

    public o0(Context context, InputtipsQuery inputtipsQuery) {
        this.f6224a = context.getApplicationContext();
        this.d = inputtipsQuery;
        this.c = y.a();
    }
}
