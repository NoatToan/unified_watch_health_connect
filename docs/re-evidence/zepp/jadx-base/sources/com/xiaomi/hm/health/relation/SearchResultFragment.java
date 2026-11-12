package com.xiaomi.hm.health.relation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.relatives.event.EventFriendSearch;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.push.MessageManager;
import com.xiaomi.hm.health.relation.copy.BaseRecyclerAdapter;
import com.xiaomi.hm.health.relation.event.EventAddFriend;
import com.xiaomi.hm.health.relation.view.FriendView;
import com.xiaomi.hm.health.relation.view.MyViewHolder;

/* JADX INFO: loaded from: classes21.dex */
public class SearchResultFragment extends Fragment {
    private static final String d = "SearchResultFragment";
    private RecyclerView a;
    private BaseRecyclerAdapter<EventFriendSearch.Friend> b;
    private LoadingDialog c;

    public class a extends BaseRecyclerAdapter<EventFriendSearch.Friend> {
        public a(int i) {
            super(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(EventFriendSearch.Friend friend, View view) {
            if (friend.code != 0) {
                IconToast.showError(SearchResultFragment.this.requireContext(), SearchResultFragment.this.getString(R.string.relatives_label_add_failed));
                return;
            }
            if (friend.uid > 0) {
                SearchResultFragment searchResultFragment = SearchResultFragment.this;
                searchResultFragment.c = LoadingDialog.showDialog(searchResultFragment.getActivity(), SearchResultFragment.this.getString(R.string.relatives_sending));
                SearchResultFragment.this.c.setCancelable(false);
                SearchResultFragment.this.c.show();
                FriendManager.getInstance().sendFriendInvited(SearchResultFragment.this.getActivity(), friend.uid, friend.token);
            }
        }

        @Override // com.xiaomi.hm.health.relation.copy.BaseRecyclerAdapter
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(MyViewHolder myViewHolder, final EventFriendSearch.Friend friend, int i) {
            FriendView friendView = (FriendView) myViewHolder.getItemView();
            friendView.setInfo(friend.iconUrl, friend.userName, friend.uid + "");
            if (friend.code != 1) {
                friendView.setAddAction(new View.OnClickListener() { // from class: com.xiaomi.hm.health.relation.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.d(friend, view);
                    }
                });
            }
        }

        @Override // com.xiaomi.hm.health.relation.copy.BaseRecyclerAdapter
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public void b(View view, int i, EventFriendSearch.Friend friend) {
            if (friend.code == 1) {
                SearchResultFragment.this.startActivity(DetailActivity.createIntent(SearchResultFragment.this.getActivity(), FriendManager.getInstance().getLocalFriendByUid(friend.uid)));
            }
        }
    }

    public class b implements LoadingDialog.OnAnimEndListener {
        public b() {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            SearchResultFragment.this.getActivity().finish();
        }
    }

    public class c implements LoadingDialog.OnAnimEndListener {
        public c() {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onAnimEnd(LoadingDialog loadingDialog) {
        }

        @Override // com.huami.android.design.dialog.loading.LoadingDialog.OnAnimEndListener
        public void onDismiss(LoadingDialog loadingDialog) {
            SearchResultFragment.this.getActivity().finish();
        }
    }

    private SearchResultFragment() {
    }

    private void c(int i) {
        if (AddFriendResult.isSuccess(i)) {
            this.c.setSuccess(getString(R.string.relatives_send_success), new b());
        } else {
            this.c.setFailed(getString(FriendUtils.toAddResultMessage(i)), new c());
        }
    }

    public static SearchResultFragment newInstance() {
        Bundle bundle = new Bundle();
        SearchResultFragment searchResultFragment = new SearchResultFragment();
        searchResultFragment.setArguments(bundle);
        return searchResultFragment;
    }

    public void dismissLoading() {
        LoadingDialog loadingDialog = this.c;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        return layoutInflater.inflate(R.layout.relatives_fragment_friend_result, viewGroup, false);
    }

    public void onEvent(EventFriendSearch eventFriendSearch) {
        if (eventFriendSearch.type != 1) {
            return;
        }
        if (!eventFriendSearch.hasData()) {
            IconToast.showError(getContext(), R.string.relatives_friend_search_not_exist);
        } else if (eventFriendSearch.friends.size() == 1 && eventFriendSearch.friends.get(0).code == -1) {
            IconToast.showError(getContext(), getString(R.string.relatives_label_add_failed));
        } else {
            this.b.update(eventFriendSearch.friends);
        }
        dismissLoading();
        HMLog.i(d, "EventFriendSearch:" + eventFriendSearch, new Object[0]);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        MessageManager.getDefault(getActivity().getApplicationContext()).register(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        MessageManager.getDefault(getActivity().getApplicationContext()).unregister(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, @Nullable Bundle bundle) {
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.friend_list);
        this.a = recyclerView;
        recyclerView.setHasFixedSize(false);
        this.a.setLayoutManager(new LinearLayoutManager(getContext()));
        a aVar = new a(R.layout.relatives_item_friend_view);
        this.b = aVar;
        this.a.setAdapter(aVar);
    }

    public void showLoading(String str) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(getActivity(), str);
        this.c = loadingDialogShowDialog;
        loadingDialogShowDialog.setCancelable(false);
    }

    public void onEvent(EventAddFriend eventAddFriend) {
        c(eventAddFriend.resultCode);
    }
}
