package com.huawei.wisesecurity.ucs.credential.entity;

import com.huawei.hidatamanager.util.Const;
import com.huawei.wisesecurity.kfs.validation.constrains.KfsStringNotEmpty;
import defpackage.yny;
import defpackage.yoj;
import defpackage.yqj;
import defpackage.yql;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes20.dex */
public class ErrorBody {

    @KfsStringNotEmpty
    private String errorCode;

    @KfsStringNotEmpty
    private String errorMessage;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    public String getErrorCode() {
        return this.errorCode;
    }

    public static ErrorBody fromString(String str) throws yqj {
        try {
            ErrorBody errorBody = new ErrorBody();
            JSONObject jSONObject = new JSONObject(str);
            errorBody.errorCode = jSONObject.optString("errorCode");
            errorBody.errorMessage = jSONObject.optString("errorMessage");
            yoj.d(errorBody);
            return errorBody;
        } catch (JSONException e) {
            StringBuilder sbB = yql.b("ErrorBody param is not a valid json string : ");
            sbB.append(e.getMessage());
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, sbB.toString());
        } catch (yny e2) {
            StringBuilder sbB2 = yql.b("ErrorBody param invalid : ");
            sbB2.append(e2.getMessage());
            throw new yqj(Const.RawDataType.HEALTH_EVENT_RECORD, sbB2.toString());
        }
    }
}
