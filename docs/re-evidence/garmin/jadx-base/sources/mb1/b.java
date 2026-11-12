package mb1;

import android.os.Bundle;
import android.text.InputFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.view.MultiLineImeEditText;
import hb2.i;
import java.util.Arrays;
import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;
import p005kotlin.jvm.internal.s;
import p13.w;
import wd1.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lmb1/b;", "Ltd1/b;", "<init>", "()V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b extends td1.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f117754n = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f117755j = 600;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MultiLineImeEditText f117756k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f117757l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Button f117758m;

    @Override // td1.b
    public final String C6() {
        String strValueOf = String.valueOf(H6().getText());
        return strValueOf.length() == 0 ? y6() : strValueOf;
    }

    @Override // td1.b
    public final pd1.a F6() {
        return pd1.a.PREGNANCY;
    }

    public final MultiLineImeEditText H6() {
        MultiLineImeEditText multiLineImeEditText = this.f117756k;
        if (multiLineImeEditText != null) {
            return multiLineImeEditText;
        }
        s.m("reminderTitleEditText");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.fragment_new_reminder, viewGroup, false);
    }

    @Override // td1.b, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        TextView textView = this.f117757l;
        if (textView == null) {
            s.m("timesSubtitleTextView");
            throw null;
        }
        c.a aVar = c.f184378a;
        List<Integer> listH = E6().h();
        aVar.getClass();
        textView.setText(c.a.a(listH));
    }

    @Override // td1.b, androidx.fragment.app.Fragment
    public final void onViewCreated(View view2, Bundle bundle) {
        view2.getClass();
        super.onViewCreated(view2, bundle);
        View viewFindViewById = view2.findViewById(R.id.new_reminder_message_input_edit_text);
        viewFindViewById.getClass();
        this.f117756k = (MultiLineImeEditText) viewFindViewById;
        H6().setHint(y6());
        if (!s.g(E6().getReminderText(), y6())) {
            H6().setText(E6().getReminderText());
        }
        MultiLineImeEditText multiLineImeEditTextH6 = H6();
        InputFilter[] filters = H6().getFilters();
        filters.getClass();
        InputFilter.LengthFilter lengthFilter = new InputFilter.LengthFilter(47);
        int length = filters.length;
        Object[] objArrCopyOf = Arrays.copyOf(filters, length + 1);
        objArrCopyOf[length] = lengthFilter;
        multiLineImeEditTextH6.setFilters((InputFilter[]) objArrCopyOf);
        View viewFindViewById2 = view2.findViewById(R.id.reminder_times_subtitle);
        viewFindViewById2.getClass();
        TextView textView = (TextView) viewFindViewById2;
        this.f117757l = textView;
        c.a aVar = c.f184378a;
        List<Integer> listH = E6().h();
        aVar.getClass();
        textView.setText(c.a.a(listH));
        TextView textView2 = this.f117757l;
        if (textView2 == null) {
            s.m("timesSubtitleTextView");
            throw null;
        }
        List<Integer> listH2 = E6().h();
        textView2.setVisibility((listH2 != null ? listH2.size() : 0) > 0 ? 0 : 8);
        View viewFindViewById3 = view2.findViewById(R.id.reminder_times_ll);
        viewFindViewById3.getClass();
        final int i14 = 0;
        ((LinearLayout) viewFindViewById3).setOnClickListener(new View.OnClickListener(this) { // from class: mb1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f117753b;

            {
                this.f117753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                td1.b.InterfaceC3083b interfaceC3083b;
                int i15 = i14;
                b bVar = this.f117753b;
                switch (i15) {
                    case 0:
                        b.a aVar2 = b.f117754n;
                        bVar.A6().debug("timesCell clicked");
                        td1.b.InterfaceC3083b interfaceC3083b2 = bVar.f163886b;
                        if (interfaceC3083b2 != null) {
                            td1.a aVar3 = bVar.f163888d;
                            if (aVar3 != null) {
                                interfaceC3083b2.k5(aVar3.f163882a);
                                return;
                            } else {
                                s.m("daysOfWeekAdapter");
                                throw null;
                            }
                        }
                        return;
                    default:
                        b.a aVar4 = b.f117754n;
                        if (!i.a(bVar.requireContext()) || (interfaceC3083b = bVar.f163886b) == null) {
                            return;
                        }
                        interfaceC3083b.G6(bVar.E6());
                        return;
                }
            }
        });
        View viewFindViewById4 = view2.findViewById(R.id.pregnancy_reminder_delete_button);
        viewFindViewById4.getClass();
        Button button = (Button) viewFindViewById4;
        this.f117758m = button;
        button.setVisibility(this.f163887c ? 0 : 8);
        Button button2 = this.f117758m;
        if (button2 == null) {
            s.m("deleteReminderButton");
            throw null;
        }
        final int i15 = 1;
        button2.setOnClickListener(new View.OnClickListener(this) { // from class: mb1.a

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f117753b;

            {
                this.f117753b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                td1.b.InterfaceC3083b interfaceC3083b;
                int i16 = i15;
                b bVar = this.f117753b;
                switch (i16) {
                    case 0:
                        b.a aVar2 = b.f117754n;
                        bVar.A6().debug("timesCell clicked");
                        td1.b.InterfaceC3083b interfaceC3083b2 = bVar.f163886b;
                        if (interfaceC3083b2 != null) {
                            td1.a aVar3 = bVar.f163888d;
                            if (aVar3 != null) {
                                interfaceC3083b2.k5(aVar3.f163882a);
                                return;
                            } else {
                                s.m("daysOfWeekAdapter");
                                throw null;
                            }
                        }
                        return;
                    default:
                        b.a aVar4 = b.f117754n;
                        if (!i.a(bVar.requireContext()) || (interfaceC3083b = bVar.f163886b) == null) {
                            return;
                        }
                        interfaceC3083b.G6(bVar.E6());
                        return;
                }
            }
        });
        RecyclerView recyclerView = (RecyclerView) view2.findViewById(R.id.new_reminder_frequency_rv);
        this.f163888d = new td1.a(E6());
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        td1.a aVar2 = this.f163888d;
        if (aVar2 != null) {
            recyclerView.setAdapter(aVar2);
        } else {
            s.m("daysOfWeekAdapter");
            throw null;
        }
    }

    @Override // td1.b
    public final int v6() {
        return R.menu.menu_add;
    }

    @Override // td1.b
    public final String w6() {
        String string = getString(R.string.pregnancy_new_reminder);
        string.getClass();
        return string;
    }

    @Override // td1.b
    public final String y6() {
        String string = getString(R.string.pregnancy_dont_forget_to);
        string.getClass();
        return string;
    }

    @Override // td1.b
    public final List<Integer> z6() {
        return w.c(Integer.valueOf(this.f117755j));
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lmb1/b$a;", "", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(j jVar) {
            this();
        }

        private a() {
        }
    }
}
