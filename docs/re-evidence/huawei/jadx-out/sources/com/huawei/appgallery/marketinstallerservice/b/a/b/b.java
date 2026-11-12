package com.huawei.appgallery.marketinstallerservice.b.a.b;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.RequestBean;
import com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.ResponseBean;
import defpackage.biq;
import defpackage.bir;
import defpackage.bit;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.util.concurrent.Executor;
import org.apache.http.conn.ConnectTimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes23.dex */
public class b extends AsyncTask<RequestBean, Void, ResponseBean> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected bit f5230b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f5231c;
    protected com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.b d;
    protected RequestBean e;

    public interface a {
        void a(b bVar);

        void b(b bVar);
    }

    public void e(ResponseBean responseBean) {
    }

    @Override // android.os.AsyncTask
    protected void onCancelled() {
        super.onCancelled();
        a aVar = this.f5231c;
        if (aVar != null) {
            aVar.b(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(ResponseBean responseBean) {
        a aVar = this.f5231c;
        if (aVar != null) {
            aVar.a(this);
        } else {
            c(responseBean);
        }
    }

    public final void b(Executor executor) {
        executeOnExecutor(executor, this.e);
    }

    protected void c(ResponseBean responseBean) {
        ResponseBean.a aVar;
        if (isCancelled() || this.d == null) {
            return;
        }
        if (responseBean == null) {
            bir.d("StoreAgent", "notifyResult, response is null");
            responseBean = this.e.getResponseBean();
            if (responseBean == null) {
                responseBean = new ResponseBean();
                aVar = ResponseBean.a.PARAM_ERROR;
            } else {
                aVar = ResponseBean.a.UNKNOWN_EXCEPTION;
            }
            responseBean.setErrCause(aVar);
            responseBean.setResponseCode(1);
        }
        this.d.a(this.e, responseBean);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public ResponseBean doInBackground(RequestBean... requestBeanArr) {
        ResponseBean responseBeanB = b(this.e.getContext());
        com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.b bVar = this.d;
        if (bVar != null) {
            bVar.b(this.e, responseBeanB);
        }
        return responseBeanB;
    }

    public final ResponseBean b(Context context) {
        ResponseBean responseBeanA = a(context);
        e(responseBeanA);
        return responseBeanA;
    }

    private ResponseBean a(ResponseBean responseBean) {
        if (responseBean != null) {
            return responseBean;
        }
        ResponseBean responseBean2 = new ResponseBean();
        responseBean2.setResponseCode(5);
        responseBean2.setErrCause(ResponseBean.a.PARAM_ERROR);
        return responseBean2;
    }

    private ResponseBean a(Context context) {
        ResponseBean.a aVar;
        ResponseBean.a aVar2;
        int i = 5;
        ResponseBean responseBean = null;
        try {
            responseBean = this.e.getResponseBean();
            if (biq.d(context)) {
                String serviceUrl = this.e.getServiceUrl();
                if (TextUtils.isEmpty(serviceUrl)) {
                    responseBean.setResponseCode(5);
                    aVar2 = ResponseBean.a.PARAM_ERROR;
                } else {
                    b(context, responseBean, serviceUrl);
                }
                return a(responseBean);
            }
            responseBean.setResponseCode(3);
            aVar2 = ResponseBean.a.NO_NETWORK;
            responseBean.setErrCause(aVar2);
        } catch (FileNotFoundException unused) {
            aVar = ResponseBean.a.RESPONSE_EXCEPTION;
            i = 7;
            e(null, i, aVar);
        } catch (ConnectException unused2) {
            aVar = ResponseBean.a.CONNECT_EXCEPTION;
            i = 1;
            e(null, i, aVar);
        } catch (SocketTimeoutException | ConnectTimeoutException unused3) {
            aVar = ResponseBean.a.CONNECT_EXCEPTION;
            i = 2;
            e(null, i, aVar);
        } catch (IOException unused4) {
            aVar = ResponseBean.a.IO_EXCEPTION;
            i = 1;
            e(null, i, aVar);
        } catch (IllegalArgumentException unused5) {
            aVar = ResponseBean.a.PARAM_ERROR;
            e(null, i, aVar);
        } catch (Throwable unused6) {
            aVar = ResponseBean.a.UNKNOWN_EXCEPTION;
            i = 1;
            e(null, i, aVar);
        }
        return a(responseBean);
    }

    private void a(String str, ResponseBean responseBean) {
        StringBuilder sb;
        String message;
        try {
            responseBean.fromJson(new JSONObject(str));
            responseBean.setResponseCode(0);
        } catch (ClassNotFoundException e) {
            sb = new StringBuilder("parse json error ClassNotFoundException, json");
            message = e.getMessage();
            sb.append(message);
            bir.d("StoreAgent", sb.toString());
        } catch (IllegalAccessException e2) {
            sb = new StringBuilder("parse json error IllegalAccessException, json");
            message = e2.getMessage();
            sb.append(message);
            bir.d("StoreAgent", sb.toString());
        } catch (IllegalArgumentException e3) {
            sb = new StringBuilder("parse json error IllegalArgumentException, json");
            message = e3.getMessage();
            sb.append(message);
            bir.d("StoreAgent", sb.toString());
        } catch (InstantiationException e4) {
            sb = new StringBuilder("parse json error InstantiationException, json");
            message = e4.getMessage();
            sb.append(message);
            bir.d("StoreAgent", sb.toString());
        } catch (JSONException e5) {
            sb = new StringBuilder("parse json error JSONException, json");
            message = e5.getMessage();
            sb.append(message);
            bir.d("StoreAgent", sb.toString());
        }
    }

    private void e(ResponseBean responseBean, int i, ResponseBean.a aVar) {
        if (responseBean != null) {
            responseBean.setResponseCode(i);
            responseBean.setErrCause(aVar);
        }
        bir.d("StoreAgent", "invoke Store error method:" + this.e.getMethod());
    }

    private void b(Context context, ResponseBean responseBean, String str) {
        String strGenBody = this.e.genBody();
        bir.c("StoreAgent", "callStore, method:" + this.e.getMethod() + ", url:" + str);
        bit bitVar = new bit();
        this.f5230b = bitVar;
        String str2 = new String(bitVar.d(context, str, strGenBody, "UTF-8"), "UTF-8");
        if (com.huawei.appgallery.marketinstallerservice.b.b.b.b.b(str2)) {
            bir.e("StoreAgent", "getServerData success");
            a(str2, responseBean);
        } else {
            bir.d("StoreAgent", "resData error,res==null or res is not JSONString!");
            responseBean.setResponseCode(1);
            responseBean.setErrCause(ResponseBean.a.JSON_ERROR);
        }
    }

    public b(RequestBean requestBean, com.huawei.appgallery.marketinstallerservice.internal.framework.storekit.bean.b bVar) {
        this.e = requestBean;
        this.d = bVar;
    }
}
