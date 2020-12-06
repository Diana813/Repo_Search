package com.dianaszczepankowska.codeaddict_recruitment_task.RepoModel;

import com.google.gson.annotations.SerializedName;

public class RepoModel {

    @SerializedName("name")
    private final String repoTitle;
    @SerializedName("owner")
    private final AuthorModel authorModel;
    @SerializedName("stargazers_count")
    private final String numberOfStars;


    public RepoModel(String repoTitle, AuthorModel authorModel, String numberOfStars) {
        this.repoTitle = repoTitle;
        this.authorModel = authorModel;
        this.numberOfStars = numberOfStars;
    }

    public String getRepoTitle() {
        return repoTitle;
    }

    public String getNumberOfStars() {
        return numberOfStars;
    }

    public AuthorModel getAuthorModel() {
        return authorModel;
    }
}