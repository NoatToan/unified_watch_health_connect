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
import java.util.ArrayList;

/* JADX INFO: loaded from: classes21.dex */
public final class ht implements IInputtipsSearch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f2657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Inputtips.InputtipsListener f2658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f2659c;
    private InputtipsQuery d;

    public ht(Context context, Inputtips.InputtipsListener inputtipsListener) throws AMapException {
        iv ivVarA = iu.a(context, ft.a(false));
        if (ivVarA.f2835a != iu.c.SuccessCode) {
            throw new AMapException(ivVarA.f2836b, 1, ivVarA.f2836b, ivVarA.f2835a.a());
        }
        this.f2657a = context.getApplicationContext();
        this.f2658b = inputtipsListener;
        this.f2659c = gf.a();
    }

    public ht(Context context, InputtipsQuery inputtipsQuery) {
        this.f2657a = context.getApplicationContext();
        this.d = inputtipsQuery;
        this.f2659c = gf.a();
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final InputtipsQuery getQuery() {
        return this.d;
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void setQuery(InputtipsQuery inputtipsQuery) {
        this.d = inputtipsQuery;
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void setInputtipsListener(Inputtips.InputtipsListener inputtipsListener) {
        this.f2658b = inputtipsListener;
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void requestInputtipsAsyn() {
        try {
            he.a().a(new Runnable() { // from class: com.amap.api.col.3sl.ht.1
                @Override // java.lang.Runnable
                public final void run() {
                    Message messageObtainMessage = gf.a().obtainMessage();
                    messageObtainMessage.obj = ht.this.f2658b;
                    messageObtainMessage.arg1 = 5;
                    try {
                        try {
                            ht htVar = ht.this;
                            ArrayList<? extends Parcelable> arrayListA = htVar.a(htVar.d);
                            Bundle bundle = new Bundle();
                            bundle.putParcelableArrayList("result", arrayListA);
                            messageObtainMessage.setData(bundle);
                            messageObtainMessage.what = 1000;
                        } catch (AMapException e) {
                            messageObtainMessage.what = e.getErrorCode();
                        }
                    } finally {
                        ht.this.f2659c.sendMessage(messageObtainMessage);
                    }
                }
            });
        } catch (Throwable th) {
            fu.a(th, "Inputtips", "requestInputtipsAsynThrowable");
        }
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final ArrayList<Tip> requestInputtips() throws AMapException {
        return a(this.d);
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void requestInputtips(String str, String str2) throws AMapException {
        requestInputtips(str, str2, null);
    }

    @Override // com.amap.api.services.interfaces.IInputtipsSearch
    public final void requestInputtips(String str, String str2, String str3) throws AMapException {
        if (str == null || str.equals("")) {
            throw new AMapException("无效的参数 - IllegalArgumentException");
        }
        InputtipsQuery inputtipsQuery = new InputtipsQuery(str, str2);
        this.d = inputtipsQuery;
        inputtipsQuery.setType(str3);
        requestInputtipsAsyn();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ArrayList<Tip> a(InputtipsQuery inputtipsQuery) throws AMapException {
        try {
            gd.a(this.f2657a);
            if (inputtipsQuery == null) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            if (inputtipsQuery.getKeyword() == null || inputtipsQuery.getKeyword().equals("")) {
                throw new AMapException("无效的参数 - IllegalArgumentException");
            }
            return new gb(this.f2657a, inputtipsQuery).d();
        } catch (Throwable th) {
            fu.a(th, "Inputtips", "requestInputtips");
            if (th instanceof AMapException) {
                throw th;
            }
            return null;
        }
    }
}
