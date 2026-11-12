package com.service.mi.common.apdu;

import com.chinaums.pppay.unify.UnifyPayListener;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class ApduResp {
    private String msg;
    private List<Rapdu> rapduList;
    private String status;

    public ApduResp(String str, String str2, List<Rapdu> list) {
        this.status = str;
        this.msg = str2;
        this.rapduList = list;
    }

    public Rapdu getLastRapdu() {
        List<Rapdu> list = this.rapduList;
        if (list == null || list.size() <= 0) {
            return null;
        }
        List<Rapdu> list2 = this.rapduList;
        return list2.get(list2.size() - 1);
    }

    public String getMsg() {
        return this.msg;
    }

    public List<Rapdu> getRapduList() {
        return this.rapduList;
    }

    public String getStatus() {
        return this.status;
    }

    public boolean isExecuteError() {
        return this.status.equalsIgnoreCase("0002");
    }

    public boolean isExecuteSuccess() {
        return this.status.equalsIgnoreCase(UnifyPayListener.ERR_OK);
    }

    public void setMsg(String str) {
        this.msg = str;
    }

    public void setRapduList(List<Rapdu> list) {
        this.rapduList = list;
    }

    public void setStatus(String str) {
        this.status = str;
    }

    public ApduResp(String str, String str2) {
        this.status = str;
        this.msg = str2;
    }

    public ApduResp() {
    }
}
