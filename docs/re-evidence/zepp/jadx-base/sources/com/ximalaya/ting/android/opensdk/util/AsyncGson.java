package com.ximalaya.ting.android.opensdk.util;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes22.dex */
public class AsyncGson<T> extends MyAsyncTask<Object, Void, Object> {
    private IResult<T> iResult;
    private IResult<T> iResultOnThread;

    public interface IResult<T> {
        void postException(Exception exc);

        void postResult(T t);
    }

    @Override // android.os.AsyncTask
    public Object doInBackground(Object[] objArr) {
        if (objArr.length == 1) {
            try {
                String json = new Gson().toJson(objArr[0]);
                IResult<T> iResult = this.iResultOnThread;
                if (iResult != null) {
                    iResult.postResult(json);
                }
                return json;
            } catch (Exception e) {
                e.printStackTrace();
                IResult<T> iResult2 = this.iResultOnThread;
                if (iResult2 != null) {
                    iResult2.postException(e);
                }
                return e;
            }
        }
        if (objArr.length != 2) {
            return new Exception("params is error");
        }
        if (objArr[1] instanceof Type) {
            try {
                return new Gson().fromJson((String) objArr[0], (Type) objArr[1]);
            } catch (Exception e2) {
                e2.printStackTrace();
                return e2;
            }
        }
        try {
            return new Gson().fromJson((String) objArr[0], (Class) objArr[1]);
        } catch (Exception e3) {
            e3.printStackTrace();
            return e3;
        }
    }

    public void fromJson(String str, Type type, @NonNull IResult<T> iResult) {
        this.iResult = iResult;
        if (TextUtils.isEmpty(str) || type == null) {
            iResult.postException(new Exception("IllegalArgument"));
        } else {
            myexec(str, type);
        }
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Object obj) {
        super.onPostExecute(obj);
        IResult<T> iResult = this.iResult;
        if (iResult != null) {
            if (obj instanceof Exception) {
                iResult.postException((Exception) obj);
            } else {
                iResult.postResult(obj);
            }
        }
    }

    public void toJson(Object obj, @NonNull IResult<T> iResult) {
        this.iResult = iResult;
        if (obj == null) {
            iResult.postException(new Exception("IllegalArgument"));
        } else {
            myexec(obj);
        }
    }

    public void toJsonResultOnThread(Object obj, @NonNull IResult iResult) {
        this.iResultOnThread = iResult;
        if (obj == null) {
            iResult.postException(new Exception("IllegalArgument"));
        } else {
            myexec(obj);
        }
    }

    public void fromJson(String str, Class<T> cls, @NonNull IResult<T> iResult) {
        this.iResult = iResult;
        if (!TextUtils.isEmpty(str) && cls != null) {
            myexec(str, cls);
        } else {
            iResult.postException(new Exception("IllegalArgument"));
        }
    }
}
