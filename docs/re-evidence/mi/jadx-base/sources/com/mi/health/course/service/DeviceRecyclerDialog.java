package com.mi.health.course.service;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.milink.sdk.cast.MiLinkDevice;
import defpackage.czi;
import defpackage.oqi;
import defpackage.sti;
import java.util.ArrayList;
import java.util.List;
import miuix.appcompat.app.c;

/* JADX INFO: loaded from: classes5.dex */
public class DeviceRecyclerDialog extends BaseDialogFragment {
    public RecyclerView d;
    public a e;
    public List<MiLinkDevice> f = new ArrayList();
    public c g;
    public a.b h;

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View viewInflate = View.inflate(getActivity(), sti.m, null);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(oqi.T);
        this.d = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        a aVar = new a(getActivity(), this.f);
        this.e = aVar;
        this.d.setAdapter(aVar);
        a.b bVar = this.h;
        if (bVar != null) {
            this.e.setOnItemClickListener(bVar);
        }
        c.a aVarE = new c.a(getActivity()).z("自定义设备列表选择").A(viewInflate).e(false);
        v(aVarE, czi.f14891b);
        c cVarB = aVarE.b();
        this.g = cVarB;
        cVarB.setCanceledOnTouchOutside(false);
        return this.g;
    }

    public void setOnItemClickListener(a.b bVar) {
        this.h = bVar;
        a aVar = this.e;
        if (aVar != null) {
            aVar.setOnItemClickListener(bVar);
        }
    }

    @Override // com.mi.health.course.service.BaseDialogFragment
    public String t() {
        return "DEVICE_LIST";
    }

    public void w(List<MiLinkDevice> list) {
        a aVar;
        this.f.clear();
        if (list != null) {
            this.f.addAll(list);
        }
        if (this.g == null || (aVar = this.e) == null) {
            return;
        }
        aVar.notifyDataSetChanged();
    }
}
