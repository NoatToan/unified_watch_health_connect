package f20;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import c22.s3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.contacts.ContactActivity;
import ew1.h1;
import java.util.Iterator;
import java.util.List;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f68395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ContactActivity f68396b;

    public /* synthetic */ j(ContactActivity contactActivity, int i14) {
        this.f68395a = i14;
        this.f68396b = contactActivity;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14;
        switch (this.f68395a) {
            case 0:
                com.garmin.android.apps.connectmobile.contacts.d.b bVar = (com.garmin.android.apps.connectmobile.contacts.d.b) obj;
                ContactActivity.a aVar = ContactActivity.T;
                l20.r rVar = bVar.f32422s;
                List<o> list = bVar.f32407d;
                List<o> list2 = bVar.f32406c;
                ContactActivity contactActivity = this.f68396b;
                if (rVar != null) {
                    contactActivity.f32293g = rVar;
                }
                if (bVar.f32404a) {
                    View view2 = contactActivity.f32301o;
                    if (view2 == null) {
                        p005kotlin.jvm.internal.s.m("noContactListView");
                        throw null;
                    }
                    view2.setVisibility(0);
                    View view3 = contactActivity.f32307w;
                    if (view3 == null) {
                        p005kotlin.jvm.internal.s.m("bottomButtonContainer");
                        throw null;
                    }
                    view3.setVisibility(8);
                    RecyclerView recyclerView = contactActivity.f32300n;
                    if (recyclerView == null) {
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    }
                    recyclerView.setVisibility(8);
                    ComposeView composeView = contactActivity.f32302p;
                    if (composeView == null) {
                        p005kotlin.jvm.internal.s.m("iconSelectContact");
                        throw null;
                    }
                    composeView.setVisibility(8);
                    TextView textView = contactActivity.f32303q;
                    if (textView == null) {
                        p005kotlin.jvm.internal.s.m("titleSelectContact");
                        throw null;
                    }
                    textView.setText(contactActivity.getString(R.string.contacts_limit_reached));
                    TextView textView2 = contactActivity.f32304r;
                    if (textView2 == null) {
                        p005kotlin.jvm.internal.s.m("descriptionSelectContact");
                        throw null;
                    }
                    textView2.setText(contactActivity.getString(R.string.contacts_limit_reached_description));
                    AppCompatButton appCompatButton = contactActivity.f32305t;
                    if (appCompatButton == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                        throw null;
                    }
                    appCompatButton.setText(contactActivity.getString(R.string.go_to_connect_contacts));
                    AppCompatButton appCompatButton2 = contactActivity.f32305t;
                    if (appCompatButton2 == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                        throw null;
                    }
                    appCompatButton2.setOnClickListener(new k(contactActivity, 0));
                    AppCompatButton appCompatButton3 = contactActivity.f32305t;
                    if (appCompatButton3 == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                        throw null;
                    }
                    appCompatButton3.setVisibility(0);
                    AppCompatButton appCompatButton4 = contactActivity.f32306v;
                    if (appCompatButton4 == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact2");
                        throw null;
                    }
                    appCompatButton4.setVisibility(8);
                } else if (bVar.f32405b) {
                    u20.e.v6(contactActivity.getString(R.string.contact_management_title_no_contact_info), contactActivity.getString(R.string.contact_management_message_no_contact_info)).g(contactActivity.getSupportFragmentManager());
                } else if (bVar.f32413j) {
                    View view4 = contactActivity.f32301o;
                    if (view4 == null) {
                        p005kotlin.jvm.internal.s.m("noContactListView");
                        throw null;
                    }
                    view4.setVisibility(0);
                    RecyclerView recyclerView2 = contactActivity.f32300n;
                    if (recyclerView2 == null) {
                        p005kotlin.jvm.internal.s.m("recyclerView");
                        throw null;
                    }
                    recyclerView2.setVisibility(8);
                    ComposeView composeView2 = contactActivity.f32302p;
                    if (composeView2 == null) {
                        p005kotlin.jvm.internal.s.m("iconSelectContact");
                        throw null;
                    }
                    composeView2.setVisibility(0);
                    View view5 = contactActivity.f32307w;
                    if (view5 == null) {
                        p005kotlin.jvm.internal.s.m("bottomButtonContainer");
                        throw null;
                    }
                    view5.setVisibility(8);
                    TextView textView3 = contactActivity.f32303q;
                    if (textView3 == null) {
                        p005kotlin.jvm.internal.s.m("titleSelectContact");
                        throw null;
                    }
                    textView3.setText(contactActivity.getString(R.string.allow_access_to_phone_contacts));
                    TextView textView4 = contactActivity.f32304r;
                    if (textView4 == null) {
                        p005kotlin.jvm.internal.s.m("descriptionSelectContact");
                        throw null;
                    }
                    textView4.setText(contactActivity.getString(R.string.read_phone_contacts_permission_message));
                    AppCompatButton appCompatButton5 = contactActivity.f32305t;
                    if (appCompatButton5 == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                        throw null;
                    }
                    appCompatButton5.setText(contactActivity.getString(R.string.lbl_allow_access));
                    AppCompatButton appCompatButton6 = contactActivity.f32305t;
                    if (appCompatButton6 == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                        throw null;
                    }
                    appCompatButton6.setVisibility(0);
                    AppCompatButton appCompatButton7 = contactActivity.f32305t;
                    if (appCompatButton7 == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                        throw null;
                    }
                    appCompatButton7.setOnClickListener(new k(contactActivity, 2));
                    AppCompatButton appCompatButton8 = contactActivity.f32306v;
                    if (appCompatButton8 == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact2");
                        throw null;
                    }
                    appCompatButton8.setText(contactActivity.getString(R.string.create_a_connect_contact));
                    AppCompatButton appCompatButton9 = contactActivity.f32306v;
                    if (appCompatButton9 == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact2");
                        throw null;
                    }
                    appCompatButton9.setVisibility(0);
                    AppCompatButton appCompatButton10 = contactActivity.f32306v;
                    if (appCompatButton10 == null) {
                        p005kotlin.jvm.internal.s.m("buttonSelectContact2");
                        throw null;
                    }
                    appCompatButton10.setOnClickListener(new k(contactActivity, 3));
                } else {
                    int i15 = 1;
                    if (bVar.f32414k) {
                        if (contactActivity.f32310z) {
                            contactActivity.setContentView(R.layout.activity_composable_container);
                            contactActivity.initActionBar(R.string.contacts, 2);
                            ((ComposeView) contactActivity.findViewById(R.id.composable_container)).setContent(new z3.e(-843639920, true, new c(contactActivity, i15)));
                        } else {
                            View view6 = contactActivity.f32301o;
                            if (view6 == null) {
                                p005kotlin.jvm.internal.s.m("noContactListView");
                                throw null;
                            }
                            view6.setVisibility(0);
                            View view7 = contactActivity.f32307w;
                            if (view7 == null) {
                                p005kotlin.jvm.internal.s.m("bottomButtonContainer");
                                throw null;
                            }
                            view7.setVisibility(8);
                            RecyclerView recyclerView3 = contactActivity.f32300n;
                            if (recyclerView3 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            recyclerView3.setVisibility(8);
                            ComposeView composeView3 = contactActivity.f32302p;
                            if (composeView3 == null) {
                                p005kotlin.jvm.internal.s.m("iconSelectContact");
                                throw null;
                            }
                            composeView3.setVisibility(0);
                            TextView textView5 = contactActivity.f32303q;
                            if (textView5 == null) {
                                p005kotlin.jvm.internal.s.m("titleSelectContact");
                                throw null;
                            }
                            textView5.setText(contactActivity.getString(R.string.no_connect_contacts));
                            AppCompatButton appCompatButton11 = contactActivity.f32305t;
                            if (appCompatButton11 == null) {
                                p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                                throw null;
                            }
                            appCompatButton11.setVisibility(0);
                            AppCompatButton appCompatButton12 = contactActivity.f32305t;
                            if (appCompatButton12 == null) {
                                p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                                throw null;
                            }
                            appCompatButton12.setText(contactActivity.getString(R.string.create_a_connect_contact));
                            AppCompatButton appCompatButton13 = contactActivity.f32305t;
                            if (appCompatButton13 == null) {
                                p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                                throw null;
                            }
                            appCompatButton13.setOnClickListener(new k(contactActivity, 1));
                            AppCompatButton appCompatButton14 = contactActivity.f32306v;
                            if (appCompatButton14 == null) {
                                p005kotlin.jvm.internal.s.m("buttonSelectContact2");
                                throw null;
                            }
                            appCompatButton14.setVisibility(8);
                            if (!(contactActivity.ia() instanceof hl.a.b) || contactActivity.f32288b == 0) {
                                TextView textView6 = contactActivity.f32304r;
                                if (textView6 == null) {
                                    p005kotlin.jvm.internal.s.m("descriptionSelectContact");
                                    throw null;
                                }
                                textView6.setText(contactActivity.getString(R.string.no_connect_contacts_description));
                            } else {
                                TextView textView7 = contactActivity.f32304r;
                                if (textView7 == null) {
                                    p005kotlin.jvm.internal.s.m("descriptionSelectContact");
                                    throw null;
                                }
                                textView7.setText(contactActivity.getString(R.string.msg_no_child_contacts));
                            }
                        }
                    } else if (bVar.f32415l) {
                        View view8 = contactActivity.f32301o;
                        if (view8 == null) {
                            p005kotlin.jvm.internal.s.m("noContactListView");
                            throw null;
                        }
                        view8.setVisibility(0);
                        View view9 = contactActivity.f32307w;
                        if (view9 == null) {
                            p005kotlin.jvm.internal.s.m("bottomButtonContainer");
                            throw null;
                        }
                        view9.setVisibility(8);
                        RecyclerView recyclerView4 = contactActivity.f32300n;
                        if (recyclerView4 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView4.setVisibility(8);
                        ComposeView composeView4 = contactActivity.f32302p;
                        if (composeView4 == null) {
                            p005kotlin.jvm.internal.s.m("iconSelectContact");
                            throw null;
                        }
                        composeView4.setVisibility(0);
                        TextView textView8 = contactActivity.f32303q;
                        if (textView8 == null) {
                            p005kotlin.jvm.internal.s.m("titleSelectContact");
                            throw null;
                        }
                        textView8.setText(contactActivity.getString(R.string.no_phone_contacts));
                        TextView textView9 = contactActivity.f32304r;
                        if (textView9 == null) {
                            p005kotlin.jvm.internal.s.m("descriptionSelectContact");
                            throw null;
                        }
                        textView9.setText(contactActivity.getString(R.string.no_phone_contacts_description));
                        AppCompatButton appCompatButton15 = contactActivity.f32305t;
                        if (appCompatButton15 == null) {
                            p005kotlin.jvm.internal.s.m("buttonSelectContact1");
                            throw null;
                        }
                        appCompatButton15.setVisibility(8);
                        AppCompatButton appCompatButton16 = contactActivity.f32306v;
                        if (appCompatButton16 == null) {
                            p005kotlin.jvm.internal.s.m("buttonSelectContact2");
                            throw null;
                        }
                        appCompatButton16.setVisibility(8);
                    } else if (bVar.f32418o) {
                        contactActivity.da();
                    } else if (list2.isEmpty()) {
                        if (!list.isEmpty()) {
                            contactActivity.B.t(0);
                            contactActivity.f32299m = new com.garmin.android.apps.connectmobile.contacts.h(contactActivity, contactActivity, true, contactActivity.ia() instanceof hl.a.c);
                            View view10 = contactActivity.f32301o;
                            if (view10 == null) {
                                p005kotlin.jvm.internal.s.m("noContactListView");
                                throw null;
                            }
                            view10.setVisibility(8);
                            RecyclerView recyclerView5 = contactActivity.f32300n;
                            if (recyclerView5 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            recyclerView5.setVisibility(0);
                            RecyclerView recyclerView6 = contactActivity.f32300n;
                            if (recyclerView6 == null) {
                                p005kotlin.jvm.internal.s.m("recyclerView");
                                throw null;
                            }
                            com.garmin.android.apps.connectmobile.contacts.h hVar = contactActivity.f32299m;
                            if (hVar == null) {
                                p005kotlin.jvm.internal.s.m("adapter");
                                throw null;
                            }
                            recyclerView6.setAdapter(hVar);
                            com.garmin.android.apps.connectmobile.contacts.h hVar2 = contactActivity.f32299m;
                            if (hVar2 == null) {
                                p005kotlin.jvm.internal.s.m("adapter");
                                throw null;
                            }
                            hVar2.t(list);
                            if (list.isEmpty()) {
                                i14 = 0;
                            } else {
                                Iterator<T> it = list.iterator();
                                i14 = 0;
                                while (it.hasNext()) {
                                    if (((o) it.next()).f68411g && (i14 = i14 + 1) < 0) {
                                        p13.x.p();
                                        throw null;
                                    }
                                }
                            }
                            contactActivity.f32291e = i14;
                            contactActivity.f32292f = list.size();
                            contactActivity.setTitle(contactActivity.ha());
                            contactActivity.setSubtitle(contactActivity.ja());
                            if (s3.b()) {
                                TextView textView10 = contactActivity.f32298l;
                                if (textView10 == null) {
                                    p005kotlin.jvm.internal.s.m("descriptionTextView");
                                    throw null;
                                }
                                textView10.setVisibility(0);
                                TextView textView11 = contactActivity.f32298l;
                                if (textView11 == null) {
                                    p005kotlin.jvm.internal.s.m("descriptionTextView");
                                    throw null;
                                }
                                textView11.setTextAppearance(R.style.Text_Body2_Secondary);
                                TextView textView12 = contactActivity.f32298l;
                                if (textView12 == null) {
                                    p005kotlin.jvm.internal.s.m("descriptionTextView");
                                    throw null;
                                }
                                textView12.setGravity(8388611);
                                TextView textView13 = contactActivity.f32298l;
                                if (textView13 == null) {
                                    p005kotlin.jvm.internal.s.m("descriptionTextView");
                                    throw null;
                                }
                                com.garmin.android.apps.connectmobile.userprofile.model.g gVar = contactActivity.A;
                                String str = gVar != null ? gVar.f46858b : null;
                                textView13.setText(contactActivity.getString(R.string.msg_child_contacts_management, str != null ? str : ""));
                            } else {
                                View view11 = contactActivity.f32307w;
                                if (view11 == null) {
                                    p005kotlin.jvm.internal.s.m("bottomButtonContainer");
                                    throw null;
                                }
                                view11.setVisibility(0);
                            }
                        } else if (bVar.f32416m) {
                            contactActivity.la(bVar.f32417n, false);
                        } else if (bVar.f32419p) {
                            if (bVar.f32420q) {
                                u20.e eVarV6 = u20.e.v6("", contactActivity.getString(R.string.contact_management_update_at_sync_message, bVar.f32421r));
                                eVarV6.f167882a = new h1(contactActivity, 1);
                                eVarV6.setCancelable(false);
                                eVarV6.g(contactActivity.getSupportFragmentManager());
                            } else {
                                contactActivity.ca();
                            }
                        } else if (contactActivity.f32288b == 3) {
                            contactActivity.hideSubtitle();
                        }
                    } else {
                        contactActivity.f32299m = new com.garmin.android.apps.connectmobile.contacts.h(contactActivity, contactActivity, false, false, 8, null);
                        View view12 = contactActivity.f32301o;
                        if (view12 == null) {
                            p005kotlin.jvm.internal.s.m("noContactListView");
                            throw null;
                        }
                        view12.setVisibility(8);
                        RecyclerView recyclerView7 = contactActivity.f32300n;
                        if (recyclerView7 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        recyclerView7.setVisibility(0);
                        View view13 = contactActivity.f32307w;
                        if (view13 == null) {
                            p005kotlin.jvm.internal.s.m("bottomButtonContainer");
                            throw null;
                        }
                        view13.setVisibility(0);
                        RecyclerView recyclerView8 = contactActivity.f32300n;
                        if (recyclerView8 == null) {
                            p005kotlin.jvm.internal.s.m("recyclerView");
                            throw null;
                        }
                        com.garmin.android.apps.connectmobile.contacts.h hVar3 = contactActivity.f32299m;
                        if (hVar3 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        recyclerView8.setAdapter(hVar3);
                        com.garmin.android.apps.connectmobile.contacts.h hVar4 = contactActivity.f32299m;
                        if (hVar4 == null) {
                            p005kotlin.jvm.internal.s.m("adapter");
                            throw null;
                        }
                        hVar4.t(list2);
                        contactActivity.setTitle(contactActivity.ha());
                        contactActivity.setSubtitle(contactActivity.ja());
                    }
                }
                return Unit.INSTANCE;
            default:
                int iIntValue = ((Integer) obj).intValue();
                ContactActivity contactActivity2 = this.f68396b;
                contactActivity2.B.t(iIntValue);
                if (iIntValue == 0) {
                    contactActivity2.ga().z4();
                } else {
                    contactActivity2.ga().A4();
                }
                return Unit.INSTANCE;
        }
    }
}
