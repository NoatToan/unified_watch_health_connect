package com.huawei.openalliance.ad.beans.metadata;

import com.huawei.openalliance.ad.annotations.a;
import com.huawei.openalliance.ad.annotations.d;
import com.huawei.openalliance.ad.beans.metadata.v3.CachedContent;
import com.huawei.openalliance.ad.hw;
import com.huawei.openalliance.ad.utils.bm;
import com.huawei.openalliance.ad.utils.dg;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class AdSlot30 {

    @d(a = "h")
    private Integer adHeight;

    @d(a = "w")
    private Integer adWidth;
    private int adtype;
    private Integer amttpv;

    @a
    private Float bidFloor;
    private String bidFloorCur;
    private List<String> bpkgName;
    private Integer bsrSet;
    private List<CachedContent> cachedContents;
    private List<String> detailedCreativeTypeList;
    private int fcFlag;
    private int height;

    @a
    private List<ImpEX> impEXs;
    private Integer isSmart;
    private Integer linkedMode;
    private Integer maxCount;
    private Integer orientation;
    private String slotid;
    private Integer splashStartMode;
    private Integer splashType;
    private String templateEnginVer;
    private List<String> templateIds;
    private int test;
    private Integer totalDuration;
    private int width;

    public List<String> y() {
        return this.bpkgName;
    }

    public String x() {
        return this.bidFloorCur;
    }

    public Float w() {
        return this.bidFloor;
    }

    public int v() {
        return this.fcFlag;
    }

    public List<CachedContent> u() {
        return this.cachedContents;
    }

    public List<String> t() {
        return this.templateIds;
    }

    public String s() {
        return this.templateEnginVer;
    }

    public Integer r() {
        return this.adHeight;
    }

    public Integer q() {
        return this.adWidth;
    }

    public Integer p() {
        return this.isSmart;
    }

    public List<String> o() {
        return this.detailedCreativeTypeList;
    }

    public Integer n() {
        return this.bsrSet;
    }

    public Integer m() {
        return this.orientation;
    }

    public Integer l() {
        return this.splashStartMode;
    }

    public void k(Integer num) {
        this.adHeight = num;
    }

    public Integer k() {
        return this.splashType;
    }

    public void j(Integer num) {
        this.adWidth = num;
    }

    public Integer j() {
        return this.totalDuration;
    }

    public void i(Integer num) {
        this.isSmart = num;
    }

    public List<ImpEX> i() {
        return this.impEXs;
    }

    public void h(Integer num) {
        this.bsrSet = num;
    }

    public Integer h() {
        return this.linkedMode;
    }

    public void g(Integer num) {
        this.orientation = num;
    }

    public Integer g() {
        return this.amttpv;
    }

    public void f(Integer num) {
        this.splashStartMode = num;
    }

    public Integer f() {
        return this.maxCount;
    }

    public void e(Integer num) {
        this.splashType = num;
    }

    public int e() {
        return this.test;
    }

    public void d(List<String> list) {
        this.bpkgName = list;
    }

    public void d(Integer num) {
        this.totalDuration = num;
    }

    public int d() {
        return this.adtype;
    }

    public void c(List<CachedContent> list) {
        this.cachedContents = e(list);
    }

    public void c(Integer num) {
        this.linkedMode = num;
    }

    public int c() {
        return this.height;
    }

    public void b(List<String> list) {
        this.detailedCreativeTypeList = list;
    }

    public void b(String str) {
        this.bidFloorCur = str;
    }

    public void b(Integer num) {
        this.amttpv = num;
    }

    public int b() {
        return this.width;
    }

    public void a(List<ImpEX> list) {
        this.impEXs = list;
    }

    public void a(String str) {
        this.templateEnginVer = str;
    }

    public void a(Integer num) {
        this.maxCount = num;
    }

    public void a(int i) {
        this.fcFlag = i;
    }

    public void a(float f) {
        this.bidFloor = Float.valueOf(f);
    }

    public String a() {
        return this.slotid;
    }

    private void f(List<CachedContent> list) {
        Collections.sort(list, new Comparator<CachedContent>() { // from class: com.huawei.openalliance.ad.beans.metadata.AdSlot30.1
            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(CachedContent cachedContent, CachedContent cachedContent2) {
                int iIntValue = 0;
                int iIntValue2 = (cachedContent == null || cachedContent.b() == null) ? 0 : cachedContent.b().intValue();
                if (cachedContent2 != null && cachedContent2.b() != null) {
                    iIntValue = cachedContent2.b().intValue();
                }
                return iIntValue - iIntValue2;
            }
        });
    }

    private List<CachedContent> e(List<CachedContent> list) {
        if (bm.a(list)) {
            return list;
        }
        if (list.size() > 1) {
            try {
                f(list);
            } catch (Exception unused) {
                hw.d("AdSlot30", "sort cachedContent error");
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (CachedContent cachedContent : list) {
            if (cachedContent != null && !dg.b(cachedContent.a()) && !arrayList2.contains(cachedContent.a())) {
                try {
                    if (cachedContent.b() != null && cachedContent.b().intValue() == 3 && !bm.a(cachedContent.c()) && cachedContent.c().size() > 1) {
                        cachedContent.a(new ArrayList(new LinkedHashSet(cachedContent.c())));
                    }
                } catch (Exception unused2) {
                    hw.d("AdSlot30", "distinctTemplateIds error");
                }
                arrayList2.add(cachedContent.a());
                arrayList.add(cachedContent);
            }
        }
        return arrayList;
    }

    public AdSlot30(String str, int i, int i2, int i3, boolean z) {
        this.fcFlag = 0;
        this.slotid = str;
        this.width = i;
        this.height = i2;
        this.test = z ? 1 : 0;
        this.adtype = i3;
    }

    public AdSlot30() {
        this.test = 0;
        this.adtype = 1;
        this.fcFlag = 0;
    }
}
