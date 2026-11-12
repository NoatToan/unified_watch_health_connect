package uj1;

import android.content.Context;
import android.location.Location;
import androidx.lifecycle.v1;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.g3;
import com.garmin.android.apps.connectmobile.view.StyledInlineTextFieldViewDark;
import com.google.android.gms.common.Scopes;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import ei0.q0;
import i3.e5;
import lc.u0;
import o53.s0;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d f171556b;

    public /* synthetic */ p(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar, int i14) {
        this.f171555a = i14;
        this.f171556b = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:181:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:219:0x045f  */
    /* JADX WARN: Code duplicated, block: B:221:0x0465  */
    /* JADX WARN: Code duplicated, block: B:222:0x046a  */
    /* JADX WARN: Code duplicated, block: B:225:0x0471  */
    /* JADX WARN: Code duplicated, block: B:227:0x0477  */
    /* JADX WARN: Code duplicated, block: B:228:0x047c  */
    /* JADX WARN: Code duplicated, block: B:229:0x047e  */
    /* JADX WARN: Code duplicated, block: B:231:0x0484  */
    /* JADX WARN: Code duplicated, block: B:232:0x0489  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        vo0.a address;
        String houseNumber;
        vo0.a address2;
        String street;
        vo0.a address3;
        String street2;
        String str;
        vo0.a address4;
        int i14 = this.f171555a;
        boolean z14 = false;
        l20.q qVarB = null;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d dVar = this.f171556b;
        switch (i14) {
            case 0:
                String str2 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str2.getClass();
                yj1.h hVar = dVar.f43759r;
                if (hVar == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                l20.q qVar = hVar.f197548b;
                dVar.f43759r = yj1.h.a(hVar, qVar != null ? l20.q.b(qVar, null, null, str2, null, null, null, null, null, null, null, null, null, null, 16777211) : null);
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark = dVar.f43749h;
                if (styledInlineTextFieldViewDark == null) {
                    p005kotlin.jvm.internal.s.m("city");
                    throw null;
                }
                if (str2.length() == 0) {
                    dVar.w6();
                    if (pj1.d0.l(dVar.f43764y)) {
                        z14 = true;
                    }
                }
                styledInlineTextFieldViewDark.setHasError(z14);
                dVar.u6();
                return Unit.INSTANCE;
            case 1:
                String str3 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str3.getClass();
                yj1.h hVar2 = dVar.f43759r;
                if (hVar2 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                l20.q qVar2 = hVar2.f197548b;
                yj1.h hVarA = yj1.h.a(hVar2, qVar2 != null ? l20.q.b(qVar2, str3, null, null, null, null, null, null, null, null, null, null, null, null, 16777214) : null);
                dVar.f43759r = hVarA;
                if (p005kotlin.jvm.internal.s.g(hVarA.f197547a, Boolean.TRUE)) {
                    StyledInlineTextFieldViewDark styledInlineTextFieldViewDark2 = dVar.f43747f;
                    if (styledInlineTextFieldViewDark2 == null) {
                        p005kotlin.jvm.internal.s.m("addressLineOne");
                        throw null;
                    }
                    styledInlineTextFieldViewDark2.setHasError(str3.length() == 0);
                }
                dVar.u6();
                return Unit.INSTANCE;
            case 2:
                String str4 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar3 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str4.getClass();
                yj1.h hVar3 = dVar.f43759r;
                if (hVar3 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                l20.q qVar3 = hVar3.f197548b;
                dVar.f43759r = yj1.h.a(hVar3, qVar3 != null ? l20.q.b(qVar3, null, null, null, null, null, null, null, str4, null, null, null, null, null, 16776703) : null);
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark3 = dVar.f43745d;
                if (styledInlineTextFieldViewDark3 == null) {
                    p005kotlin.jvm.internal.s.m("nameTextView");
                    throw null;
                }
                styledInlineTextFieldViewDark3.setHasError(str4.length() == 0);
                dVar.u6();
                return Unit.INSTANCE;
            case 3:
                String str5 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar4 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str5.getClass();
                yj1.h hVar4 = dVar.f43759r;
                if (hVar4 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                l20.q qVar4 = hVar4.f197548b;
                dVar.f43759r = yj1.h.a(hVar4, qVar4 != null ? l20.q.b(qVar4, null, str5, null, null, null, null, null, null, null, null, null, null, null, 16777213) : null);
                return Unit.INSTANCE;
            case 4:
                String str6 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str6.getClass();
                yj1.h hVar5 = dVar.f43759r;
                if (hVar5 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                l20.q qVar5 = hVar5.f197548b;
                yj1.h hVarA2 = yj1.h.a(hVar5, qVar5 != null ? l20.q.b(qVar5, null, null, null, null, null, null, null, null, null, null, null, null, str6, 8388607) : null);
                dVar.f43759r = hVarA2;
                if (p005kotlin.jvm.internal.s.g(hVarA2.f197547a, Boolean.TRUE)) {
                    StyledInlineTextFieldViewDark styledInlineTextFieldViewDark4 = dVar.f43751j;
                    if (styledInlineTextFieldViewDark4 == null) {
                        p005kotlin.jvm.internal.s.m("zipCode");
                        throw null;
                    }
                    styledInlineTextFieldViewDark4.setHasError(str6.length() == 0);
                }
                dVar.u6();
                return Unit.INSTANCE;
            case 5:
                g3 g3Var = (g3) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar6 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                int i15 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.b.f43766a[g3Var.f35300a.ordinal()];
                if (i15 == 1) {
                    g22.e.f(dVar);
                    T t7 = g3Var.f35301b;
                    t7.getClass();
                    vo0.e eVar = (vo0.e) t7;
                    yj1.h hVar6 = dVar.f43759r;
                    if (hVar6 == null) {
                        p005kotlin.jvm.internal.s.m("informationUIModel");
                        throw null;
                    }
                    l20.q qVar6 = hVar6.f197548b;
                    if (qVar6 != null) {
                        vo0.a address5 = eVar.getAddress();
                        if (g22.n.d(address5 != null ? address5.getHouseNumber() : null)) {
                            vo0.a address6 = eVar.getAddress();
                            if (g22.n.d(address6 != null ? address6.getStreet() : null)) {
                                vo0.a address7 = eVar.getAddress();
                                String houseNumber2 = address7 != null ? address7.getHouseNumber() : null;
                                vo0.a address8 = eVar.getAddress();
                                street2 = e5.g(houseNumber2, StringUtils.SPACE, address8 != null ? address8.getStreet() : null);
                            } else {
                                address = eVar.getAddress();
                                if (address != null) {
                                    houseNumber = address.getHouseNumber();
                                } else {
                                    houseNumber = null;
                                }
                                if (g22.n.d(houseNumber)) {
                                    address4 = eVar.getAddress();
                                    if (address4 != null) {
                                        street2 = address4.getHouseNumber();
                                    } else {
                                        str = null;
                                    }
                                } else {
                                    address2 = eVar.getAddress();
                                    if (address2 != null) {
                                        street = address2.getStreet();
                                    } else {
                                        street = null;
                                    }
                                    if (g22.n.d(street)) {
                                    }
                                    str = null;
                                }
                            }
                            str = street2;
                        } else {
                            address = eVar.getAddress();
                            if (address != null) {
                                houseNumber = address.getHouseNumber();
                            } else {
                                houseNumber = null;
                            }
                            if (g22.n.d(houseNumber)) {
                                address4 = eVar.getAddress();
                                if (address4 != null) {
                                    street2 = address4.getHouseNumber();
                                    str = street2;
                                } else {
                                    str = null;
                                }
                            } else {
                                address2 = eVar.getAddress();
                                if (address2 != null) {
                                    street = address2.getStreet();
                                } else {
                                    street = null;
                                }
                                if (g22.n.d(street) || (address3 = eVar.getAddress()) == null) {
                                    str = null;
                                } else {
                                    street2 = address3.getStreet();
                                    str = street2;
                                }
                            }
                        }
                        vo0.a address9 = eVar.getAddress();
                        String city = address9 != null ? address9.getCity() : null;
                        vo0.a address10 = eVar.getAddress();
                        String state = address10 != null ? address10.getState() : null;
                        vo0.a address11 = eVar.getAddress();
                        String countryName = address11 != null ? address11.getCountryName() : null;
                        vo0.a address12 = eVar.getAddress();
                        qVarB = l20.q.b(qVar6, str, null, city, countryName, null, null, null, null, null, null, null, state, address12 != null ? address12.getPostalCode() : null, 7340010);
                    }
                    dVar.f43759r = yj1.h.a(hVar6, qVarB);
                    dVar.J6();
                    dVar.K6();
                    dVar.M6();
                    dVar.V6();
                    dVar.X6();
                    dVar.S6();
                    dVar.u6();
                } else if (i15 == 2) {
                    g22.e.l(dVar);
                } else {
                    if (i15 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(dVar);
                    dVar.G6();
                }
                return Unit.INSTANCE;
            case 6:
                String str7 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar7 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str7.getClass();
                dVar.f43763x = str7;
                yj1.h hVar7 = dVar.f43759r;
                if (hVar7 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                Boolean bool = hVar7.f197547a;
                Boolean bool2 = Boolean.TRUE;
                if (p005kotlin.jvm.internal.s.g(bool, bool2) && g22.n.d(dVar.f43763x)) {
                    yj1.h hVar8 = dVar.f43759r;
                    if (hVar8 == null) {
                        p005kotlin.jvm.internal.s.m("informationUIModel");
                        throw null;
                    }
                    if (p005kotlin.jvm.internal.s.g(hVar8.f197547a, bool2)) {
                        dVar.w6();
                        if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
                            pj1.s sVarW6 = dVar.w6();
                            StyledInlineTextFieldViewDark styledInlineTextFieldViewDark5 = dVar.f43754m;
                            if (styledInlineTextFieldViewDark5 == null) {
                                p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                                throw null;
                            }
                            String title = styledInlineTextFieldViewDark5.getTitle();
                            sVarW6.p5(title != null ? title : "", str7);
                        } else {
                            com.garmin.android.apps.connectmobile.contacts.i.f32732a.getClass();
                            if (!com.garmin.android.apps.connectmobile.contacts.i.a.a(str7)) {
                                dVar.I6(dVar.getString(R.string.phone_number_validation_message, "7", "15"), null);
                            }
                        }
                    } else {
                        dVar.A6(false);
                    }
                } else {
                    dVar.A6(false);
                }
                dVar.u6();
                return Unit.INSTANCE;
            case 7:
                String str8 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar8 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str8.getClass();
                dVar.f43763x = str8;
                dVar.u6();
                return Unit.INSTANCE;
            case 8:
                String str9 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar9 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str9.getClass();
                yj1.h hVar9 = dVar.f43759r;
                if (hVar9 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                l20.q qVar7 = hVar9.f197548b;
                dVar.f43759r = yj1.h.a(hVar9, qVar7 != null ? l20.q.b(qVar7, null, null, null, null, null, null, null, null, null, null, null, str9, null, 15728639) : null);
                StyledInlineTextFieldViewDark styledInlineTextFieldViewDark6 = dVar.f43750i;
                if (styledInlineTextFieldViewDark6 == null) {
                    p005kotlin.jvm.internal.s.m(RemoteConfigConstants.ResponseFieldKey.STATE);
                    throw null;
                }
                if (str9.length() == 0) {
                    dVar.w6();
                    if (pj1.d0.l(dVar.f43764y)) {
                        z14 = true;
                    }
                }
                styledInlineTextFieldViewDark6.setHasError(z14);
                dVar.u6();
                return Unit.INSTANCE;
            case 9:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar10 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                ((String) obj).getClass();
                yj1.h hVar10 = dVar.f43759r;
                if (hVar10 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                if (p005kotlin.jvm.internal.s.g(hVar10.f197547a, Boolean.TRUE) && !nb2.a.a(dVar.f43761v)) {
                    new androidx.appcompat.app.e.a(dVar.requireContext()).setMessage(dVar.getString(R.string.email_validation_message)).setCancelable(false).setPositiveButton(dVar.getString(android.R.string.ok), new ty1.o(13)).create().show();
                }
                return Unit.INSTANCE;
            case 10:
                String str10 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar11 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str10.getClass();
                dVar.f43761v = str10;
                yj1.h hVar11 = dVar.f43759r;
                if (hVar11 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                if (p005kotlin.jvm.internal.s.g(hVar11.f197547a, Boolean.TRUE)) {
                    StyledInlineTextFieldViewDark styledInlineTextFieldViewDark7 = dVar.f43753l;
                    if (styledInlineTextFieldViewDark7 == null) {
                        p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
                        throw null;
                    }
                    styledInlineTextFieldViewDark7.setHasError(!nb2.a.a(dVar.f43761v));
                    StyledInlineTextFieldViewDark styledInlineTextFieldViewDark8 = dVar.f43753l;
                    if (styledInlineTextFieldViewDark8 == null) {
                        p005kotlin.jvm.internal.s.m(Scopes.EMAIL);
                        throw null;
                    }
                    styledInlineTextFieldViewDark8.setShowsErrorIcon(g22.n.d(dVar.f43761v));
                    dVar.u6();
                }
                return Unit.INSTANCE;
            case 11:
                String str11 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar12 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str11.getClass();
                dVar.f43762w = str11;
                yj1.h hVar12 = dVar.f43759r;
                if (hVar12 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                if (p005kotlin.jvm.internal.s.g(hVar12.f197547a, Boolean.TRUE)) {
                    dVar.w6();
                    if (com.garmin.android.apps.connectmobile.contacts.b.e()) {
                        dVar.w6().p5(str11, "");
                    } else {
                        com.garmin.android.apps.connectmobile.contacts.i.f32732a.getClass();
                        dVar.z6(!com.garmin.android.apps.connectmobile.contacts.i.a.a(str11));
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark9 = dVar.f43754m;
                        if (styledInlineTextFieldViewDark9 == null) {
                            p005kotlin.jvm.internal.s.m("primaryPhoneNumber");
                            throw null;
                        }
                        if (styledInlineTextFieldViewDark9.getHasError()) {
                            dVar.I6(dVar.getString(R.string.phone_number_validation_message, "7", "15"), null);
                        }
                    }
                }
                dVar.u6();
                return Unit.INSTANCE;
            case 12:
                String str12 = (String) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar13 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                str12.getClass();
                dVar.f43762w = str12;
                yj1.h hVar13 = dVar.f43759r;
                if (hVar13 == null) {
                    p005kotlin.jvm.internal.s.m("informationUIModel");
                    throw null;
                }
                if (p005kotlin.jvm.internal.s.g(hVar13.f197547a, Boolean.TRUE)) {
                    com.garmin.android.apps.connectmobile.contacts.i.f32732a.getClass();
                    dVar.z6(!com.garmin.android.apps.connectmobile.contacts.i.a.a(str12));
                }
                dVar.u6();
                return Unit.INSTANCE;
            case 13:
                g3 g3Var2 = (g3) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar14 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                g3Var2.getClass();
                T t14 = g3Var2.f35301b;
                int i16 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.b.f43766a[g3Var2.f35300a.ordinal()];
                if (i16 == 1) {
                    g22.e.f(dVar);
                    yj1.i iVar = (yj1.i) t14;
                    if (iVar != null) {
                        Boolean valid = iVar.f197552a.getValid();
                        Boolean bool3 = Boolean.FALSE;
                        dVar.z6(p005kotlin.jvm.internal.s.g(valid, bool3));
                        StyledInlineTextFieldViewDark styledInlineTextFieldViewDark10 = dVar.f43755n;
                        if (styledInlineTextFieldViewDark10 == null) {
                            p005kotlin.jvm.internal.s.m("secondaryPhoneNumber");
                            throw null;
                        }
                        dVar.A6(g22.n.d(styledInlineTextFieldViewDark10.getText()) && p005kotlin.jvm.internal.s.g(iVar.f197553b.getValid(), bool3));
                        if (p005kotlin.jvm.internal.s.g(iVar.f197552a.getValid(), bool3) && !dVar.f43760t) {
                            dVar.I6(dVar.getString(R.string.les_invalid_phone_number_dialog_title), dVar.getString(R.string.contacts_validation_myinfo_invalid_number_msg));
                        }
                    }
                    dVar.f43760t = false;
                } else if (i16 == 2) {
                    g22.e.l(dVar);
                } else {
                    if (i16 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(dVar);
                    if (g3Var2.f35303d != null) {
                        Context context = dVar.getContext();
                        if (context != null) {
                            q0.b(context);
                        }
                    } else {
                        yj1.i iVar2 = (yj1.i) t14;
                        if (iVar2 != null) {
                            dVar.z6(true);
                            dVar.A6(p005kotlin.jvm.internal.s.g(iVar2.f197553b.getValid(), Boolean.FALSE));
                            if (!dVar.f43760t) {
                                dVar.I6(dVar.getString(R.string.les_invalid_phone_number_dialog_title), dVar.getString(R.string.contacts_validation_myinfo_invalid_number_msg));
                            }
                        }
                    }
                    dVar.f43760t = false;
                }
                return Unit.INSTANCE;
            case 14:
                g3 g3Var3 = (g3) obj;
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar15 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                int i17 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.b.f43766a[g3Var3.f35300a.ordinal()];
                if (i17 == 1) {
                    g22.e.f(dVar);
                    Location location = (Location) g3Var3.f35301b;
                    if (location != null) {
                        pj1.m mVarV6 = dVar.v6();
                        boolean z15 = dVar.f43764y;
                        mVarV6.f137945c.j(g3.a.c(g3.f35298f));
                        w9.a aVarA = v1.a(mVarV6);
                        x53.c cVar = s0.f129406a;
                        ge1.b.T(aVarA, x53.b.f189152a, null, new pj1.n(mVarV6, location, z15, null), 2);
                    } else {
                        dVar.G6();
                    }
                } else if (i17 == 2) {
                    g22.e.l(dVar);
                } else {
                    if (i17 != 3) {
                        u0.r();
                        return null;
                    }
                    g22.e.f(dVar);
                    String str13 = g3Var3.f35302c;
                    if (str13 == null) {
                        dVar.G6();
                    } else {
                        int iHashCode = str13.hashCode();
                        if (iHashCode != -2023363728) {
                            if (iHashCode != 23232787) {
                                if (iHashCode == 1861077560 && str13.equals("LOCATION_SERVICES_OFF")) {
                                    c22.f fVar = c22.f.f23050a;
                                    Context contextRequireContext = dVar.requireContext();
                                    contextRequireContext.getClass();
                                    c22.f.d(fVar, contextRequireContext, dVar.getString(R.string.lbl_location_access_needed), dVar.getString(R.string.msg_turn_on_location_in_phone_settings), new o13.p(dVar.getString(R.string.lbl_settings), new t(dVar, 0)), new o13.p(dVar.getString(R.string.lbl_cancel), new a(6)), null, false, 96).show();
                                } else {
                                    dVar.G6();
                                }
                            } else if (str13.equals("LOCATION_NOT_AVAILABLE")) {
                                dVar.G6();
                            } else {
                                dVar.G6();
                            }
                        } else if (str13.equals("NEED_LOCATION_PERMISSION")) {
                            dVar.F6();
                        } else {
                            dVar.G6();
                        }
                    }
                }
                return Unit.INSTANCE;
            case 15:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar16 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                dVar.S6();
                return Unit.INSTANCE;
            default:
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.a aVar17 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.d.X;
                dVar.T6();
                return Unit.INSTANCE;
        }
    }
}
